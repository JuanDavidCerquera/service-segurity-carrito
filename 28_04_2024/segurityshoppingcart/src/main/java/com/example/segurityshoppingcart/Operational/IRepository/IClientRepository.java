package com.example.segurityshoppingcart.Operational.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Entity.Client;



@Repository
public interface IClientRepository extends IBaseRepository<Client, Long>{

}
