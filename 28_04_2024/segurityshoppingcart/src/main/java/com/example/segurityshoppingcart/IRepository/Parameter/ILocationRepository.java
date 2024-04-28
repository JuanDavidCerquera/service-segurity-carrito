package com.example.segurityshoppingcart.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Parameter.Location;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface ILocationRepository extends IBaseRepository<Location, Long> {

}
