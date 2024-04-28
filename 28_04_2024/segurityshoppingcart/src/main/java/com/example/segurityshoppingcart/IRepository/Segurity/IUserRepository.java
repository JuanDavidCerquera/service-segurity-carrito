package com.example.segurityshoppingcart.IRepository.Segurity;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Segurity.User;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IUserRepository extends IBaseRepository<User,Long>{
    
}
