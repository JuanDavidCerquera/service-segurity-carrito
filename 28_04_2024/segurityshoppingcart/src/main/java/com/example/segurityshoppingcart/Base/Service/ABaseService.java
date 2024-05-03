package com.example.segurityshoppingcart.Base.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;
import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.IService.IBaseService;
/*
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
*/


public abstract class ABaseService<T extends ABaseEntity> implements IBaseService<T> {
    
    
    protected abstract  IBaseRepository<T, Long> getRepository();
    /*
    protected abstract Class<T> getEntityClass();
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<T> allByDeletedAt() throws Exception {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(getEntityClass());
        Root<T> root = query.from(getEntityClass());

        // Agrega la condición para filtrar los registros no eliminados
        query.select(root)
             .where(criteriaBuilder.isNull(root.get("deletedAt")));

        // Ejecuta la consulta y devuelve los resultados
        return entityManager.createQuery(query).getResultList();
    }
    */
    @Override
    public List<T> all() throws Exception {
        return getRepository().findAll();
    }
    @Override
    public List<T> findByStateTrue() throws Exception {
        return getRepository().findAll();
    }


    @Override
    public Optional<T> findById(Long id) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }   
        return op;
    }

 
    @Override
    public T save(T entity) throws Exception {
        try {
            entity.setCreatedAt(LocalDateTime.now());
            entity.setCreatedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth
            return getRepository().save(entity);
        } catch (Exception e) {
            // Captura la excepción
            throw new Exception("Error al guardar la entidad: " + e.getMessage());
        }
    }

 
    @Override
    public void update(Long id, T entity) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        } else if (op.get().getDeletedAt() != null) {
            throw new Exception("Registro inhabilitado");
        }

        T entityUpdate = op.get();

        String[] ignoreProperties = { "id", "createdAt", "deletedAt", "createdBy", "deletedBy" };
        BeanUtils.copyProperties(entity, entityUpdate, ignoreProperties);
        entityUpdate.setUpdatedAt(LocalDateTime.now());
        entityUpdate.setUpdatedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth
        getRepository().save(entityUpdate);
    }


    @Override
    public void delete(Long id) throws Exception {
        Optional<T> op = getRepository().findById(id);

        if (op.isEmpty()) {
            throw new Exception("Registro no encontrado");
        }

        T entityUpdate = op.get();
        entityUpdate.setDeletedAt(LocalDateTime.now());
        entityUpdate.setDeletedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth

        getRepository().save(entityUpdate);
    }
}
