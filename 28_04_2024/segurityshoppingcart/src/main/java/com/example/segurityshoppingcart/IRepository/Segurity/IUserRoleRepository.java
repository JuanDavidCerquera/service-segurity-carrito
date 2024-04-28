package com.example.segurityshoppingcart.IRepository.Segurity;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Segurity.UserRole;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IUserRoleRepository extends IBaseRepository<UserRole,Long>{
    
}
