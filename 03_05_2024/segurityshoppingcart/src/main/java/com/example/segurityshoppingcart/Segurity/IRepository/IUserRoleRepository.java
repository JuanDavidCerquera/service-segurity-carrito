package com.example.segurityshoppingcart.Segurity.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Segurity.Entity.UserRole;

@Repository
public interface IUserRoleRepository extends IBaseRepository<UserRole,Long>{
    
}
