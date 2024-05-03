package com.example.segurityshoppingcart.Segurity.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Segurity.Entity.Modules;

@Repository
public interface IModuleRepository extends IBaseRepository<Modules, Long>{

}
