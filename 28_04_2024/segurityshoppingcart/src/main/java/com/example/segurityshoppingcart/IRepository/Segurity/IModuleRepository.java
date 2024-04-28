package com.example.segurityshoppingcart.IRepository.Segurity;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Segurity.Modules;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IModuleRepository extends IBaseRepository<Modules, Long>{

}
