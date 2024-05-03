package com.example.segurityshoppingcart.Base.IService;

import java.util.List;
import java.util.Optional;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

public interface IGenericService<T extends ABaseEntity> {


    List<T> all() throws Exception;

    List<T> allByDeletedAt() throws Exception;


    Optional<T> findById(Long id) throws Exception;


    T save(T entity) throws Exception;


    void update(Long id, T entity) throws Exception;


    void delete(Long id) throws Exception;
    
    
}