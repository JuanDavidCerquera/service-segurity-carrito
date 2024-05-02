package com.example.segurityshoppingcart.Parameter.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Parameter.Entity.Neighborhood;

@Repository
public interface INeighborhoodRepository extends IBaseRepository<Neighborhood, Long>{

}
