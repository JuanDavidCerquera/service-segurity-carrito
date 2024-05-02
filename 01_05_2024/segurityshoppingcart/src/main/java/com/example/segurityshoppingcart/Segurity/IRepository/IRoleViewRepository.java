package com.example.segurityshoppingcart.Segurity.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Segurity.Entity.RoleView;

@Repository
public interface IRoleViewRepository extends IBaseRepository<RoleView,Long>{
    
}
