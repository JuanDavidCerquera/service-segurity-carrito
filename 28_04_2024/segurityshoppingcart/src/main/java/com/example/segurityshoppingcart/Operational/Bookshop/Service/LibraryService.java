package com.example.segurityshoppingcart.Operational.Bookshop.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Book;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Library;
import com.example.segurityshoppingcart.Operational.Bookshop.IRepository.IBookRepository;
import com.example.segurityshoppingcart.Operational.Bookshop.IRepository.ILibraryRepository;
import com.example.segurityshoppingcart.Operational.Bookshop.IService.ILibraryService;

@Service
public class LibraryService extends ABaseService<Library> implements ILibraryService{

	@Override
	protected IBaseRepository<Library, Long> getRepository() {
		return repository;
	}
	
	@Override
	protected Class<Library> getEntityClass() {
		return Library.class;
	}
	
	@Autowired
	private ILibraryRepository repository;
	
	@Autowired
	private IBookRepository bookRepository;
	
	
	@Override
	public Library save(Library entity) throws Exception {
	    try {
	       
	        entity.setCreatedAt(LocalDateTime.now());
	        entity.setDate(LocalDateTime.now());
	        entity.setCreatedBy((long) 1); 
	        
	        // Guardar el PrestamoLibro en la base de datos
	        Library savedPrestamoLibro = getRepository().save(entity);
	        
	        // Obtener el libro asociado al PrestamoLibro
	        Optional<Book> optionalLibro = bookRepository.findById(savedPrestamoLibro.getBook().getId());
	        
	        if (optionalLibro.isPresent()) {
	            Book libro = optionalLibro.get();
	            int nuevaCantidad;

	            // Verificar la acción para determinar la operación a realizar
	            if (!savedPrestamoLibro.getAction()) {
	                // Sumar prestamoLibroCantidad a libroCantidad
	                nuevaCantidad = libro.getAmount() + savedPrestamoLibro.getAmount();
	            } else {
	                // Restar prestamoLibroCantidad de libroCantidad si es true y prestamoLibroCantidad <= libroCantidad
	                if (savedPrestamoLibro.getAmount() <= libro.getAmount()) {
	                    nuevaCantidad = libro.getAmount() - savedPrestamoLibro.getAmount();
	                } else {
	                    throw new Exception("Cantidad de préstamo excede la cantidad de libros disponibles.");
	                }
	            }

	            // Actualizar la cantidad de libros en la entidad Libro
	            libro.setAmount(nuevaCantidad);
	            bookRepository.save(libro);
	        } else {
	            throw new Exception("Libro no encontrado");
	        }

	        return savedPrestamoLibro;
	    } catch (Exception e) {
	        throw new Exception("Error al guardar la entidad: " + e.getMessage());
	    }
	}
	
	
    @Override
    public void update(Long id, Library entity) throws Exception {
        Optional<Library> op = getRepository().findById(id);
        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        } else if (op.get().getDeletedAt() != null) {
            throw new Exception("Registro inhabilitado");
        }
        Library entityUpdate = op.get();
        
        Optional<Book> optionalLibro = bookRepository.findById(entityUpdate.getBook().getId());
        
        int cantidadInicial = entityUpdate.getAmount();
        int cantidadNueva = entity.getAmount();
        int cantidadLibro = cantidadInicial - cantidadNueva;
        


   

        if (optionalLibro.isPresent()) {
            Book libro = optionalLibro.get();
            int nuevaCantidad;
            
            
            //si la accion cambia se debe retomar el doble de lo que se presto y restarlo al stock libro
            //en caso de que cambie de prestado a devuelto
            //cantidadinicial2 * (-2)
            //cantidadlibro + o - cantidadinicial2
            if(entityUpdate.getAction() != entity.getAction()) {
            	int cantidadInicial2 = entityUpdate.getAmount();
            	cantidadInicial2 = cantidadInicial2 * (-2);
            	if (!entity.getAction()) {
            		nuevaCantidad= libro.getAmount() - cantidadInicial2;
            		
            		if(nuevaCantidad >= 0) {
            			libro.setAmount(nuevaCantidad);
            		}else {
                        throw new Exception("Cantidad de préstamo excede la cantidad de libros disponibles.");
                    }
            		
            }else {
        		nuevaCantidad= libro.getAmount() + cantidadInicial2;
        		if(nuevaCantidad >= 0) {
        			libro.setAmount(nuevaCantidad);
        		}else {
                    throw new Exception("Cantidad de préstamo excede la cantidad de libros disponibles.");
                }
            	}
            }
            // Verificar la acción para determinar la operación a realizar
            if (!entity.getAction()) {
                // Sumar prestamoLibroCantidad a libroCantidad
                nuevaCantidad = libro.getAmount() - cantidadLibro;
            } else {
                // Restar prestamoLibroCantidad de libroCantidad si es true y prestamoLibroCantidad <= libroCantidad
             
                    nuevaCantidad = libro.getAmount() + cantidadLibro;
            }
            // Actualizar la cantidad de libros en la entidad Libro
    		if(nuevaCantidad >= 0) {
    			libro.setAmount(nuevaCantidad);
    		}else {
                throw new Exception("Cantidad de préstamo excede la cantidad de libros disponibles.");
            }
            bookRepository.save(libro);
        }
        else {
            throw new Exception("Libro no encontrado");
        }
        
        
        
        
        String[] ignoreProperties = { "id", "createdAt", "deletedAt", "createdBy", "deletedBy" };
        BeanUtils.copyProperties(entity, entityUpdate, ignoreProperties);
        entityUpdate.setUpdatedAt(LocalDateTime.now());
        entityUpdate.setUpdatedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth
        getRepository().save(entityUpdate);
    }





}
