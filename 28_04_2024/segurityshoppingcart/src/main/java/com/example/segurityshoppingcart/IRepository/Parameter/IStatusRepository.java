package com.example.segurityshoppingcart.IRepository.Parameter;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Parameter.Status;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IStatusRepository extends IBaseRepository<Status, Long>{

}
