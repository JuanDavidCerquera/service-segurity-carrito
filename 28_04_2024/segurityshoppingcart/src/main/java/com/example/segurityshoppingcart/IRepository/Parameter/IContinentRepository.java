package com.example.segurityshoppingcart.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Parameter.Continent;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IContinentRepository extends IBaseRepository<Continent, Long>{

}
