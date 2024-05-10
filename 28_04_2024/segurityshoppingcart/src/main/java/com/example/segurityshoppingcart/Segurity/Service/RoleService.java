package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.Role;
import com.example.segurityshoppingcart.Segurity.IRepository.IRoleRepository;
import com.example.segurityshoppingcart.Segurity.IService.IRoleService;

@Service
public class RoleService extends ABaseService<Role> implements IRoleService{
           	
	@Override
	protected IBaseRepository<Role, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IRoleRepository repository;

	@Override
	protected Class<Role> getEntityClass() {
		return Role.class;
	}
}
