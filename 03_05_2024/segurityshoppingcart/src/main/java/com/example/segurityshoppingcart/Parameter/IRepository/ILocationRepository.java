package com.example.segurityshoppingcart.Parameter.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Parameter.Entity.Location;

@Repository
public interface ILocationRepository extends IBaseRepository<Location, Long> {

}
