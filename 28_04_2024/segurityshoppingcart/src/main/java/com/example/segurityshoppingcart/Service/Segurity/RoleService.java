package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.Role;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IRoleRepository;
import com.example.segurityshoppingcart.IService.Segurity.IRoleService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class RoleService extends ABaseService<Role> implements IRoleService{
           	
	@Override
	protected IBaseRepository<Role, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IRoleRepository repository;
}
