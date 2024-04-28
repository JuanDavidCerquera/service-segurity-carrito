package com.example.segurityshoppingcart.IRepository.Segurity;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Segurity.Role;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IRoleRepository extends IBaseRepository<Role,Long> {
    
}
