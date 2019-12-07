package com.example.segurityshoppingcart.Operational.Base.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Base.Entity.Employed;

@Repository
public interface IEmployedRepository extends IBaseRepository<Employed, Long>{

}
