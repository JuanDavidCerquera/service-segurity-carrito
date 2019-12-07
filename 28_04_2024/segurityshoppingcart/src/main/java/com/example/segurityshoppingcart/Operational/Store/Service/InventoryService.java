 package com.example.segurityshoppingcart.Operational.Store.Service;


import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Inventory;
import com.example.segurityshoppingcart.Operational.Store.Entity.Story;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IInventoryRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IInventoryService;
import com.example.segurityshoppingcart.Operational.Store.IService.IStoryService;

@Service
public class InventoryService extends ABaseService<Inventory> implements IInventoryService{

	@Override
	protected IBaseRepository<Inventory, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IInventoryRepository repository;
	
	@Autowired
	private IStoryService storeService;
	

	  @Override
	    public Inventory save(Inventory entity) throws Exception {
	        try {
	            entity.setCreatedAt(LocalDateTime.now());
	            entity.setCreatedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth
	           
	           
	            saveStore(entity);
	            return getRepository().save(entity);
	           
	            
	        } catch (Exception e) {
	            // Captura la excepción
	            throw new Exception("Error al guardar la entidad: " + e.getMessage());
	        }
	    }
	  @Override
	    public void update(Long id, Inventory entity) throws Exception {
	        Optional<Inventory> op = getRepository().findById(id);

	        if (op.isEmpty()) {
	            throw new Exception("Registro no encontrado");
	        } else if (op.get().getDeletedAt() != null) {
	            throw new Exception("Registro inhabilitado");
	        }
	        saveStore(entity);
	        Inventory entityUpdate = op.get();

	        String[] ignoreProperties = { "id", "createdAt", "deletedAt", "createdBy", "deletedBy" };
	        BeanUtils.copyProperties(entity, entityUpdate, ignoreProperties);
	        entityUpdate.setUpdatedAt(LocalDateTime.now());
	        entityUpdate.setUpdatedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth
	        getRepository().save(entityUpdate);
	    }
	  
	  private void saveStore(Inventory entity) throws Exception {
		    try {
		  Story story = new Story();
          story.setAmount(entity.getAmount());
          story.setState(entity.getState());
          story.setStore(entity.getStore());
          story.setSupplies(entity.getSupplies());
          story.setDate(LocalDateTime.now());
          storeService.save(story);
		    }catch (Exception e) {
	            // Captura la excepción
	            throw new Exception("Error al guardar la story: " + e.getMessage());
	        }
	  }
}
