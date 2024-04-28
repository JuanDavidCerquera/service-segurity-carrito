package com.example.segurityshoppingcart.IRepository.Segurity;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Segurity.View;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IViewRepository extends IBaseRepository<View,Long>{
    
}
