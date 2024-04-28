package com.example.segurityshoppingcart.IRepository.Segurity;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Segurity.Person;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IPersonRepository extends IBaseRepository<Person,Long>{
    
}
