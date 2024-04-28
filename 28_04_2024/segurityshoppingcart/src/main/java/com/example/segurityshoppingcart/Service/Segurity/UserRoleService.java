package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.UserRole;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IUserRoleRepository;
import com.example.segurityshoppingcart.IService.Segurity.IUserRoleService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class UserRoleService extends ABaseService<UserRole> implements IUserRoleService{
           	@Override
	protected IBaseRepository<UserRole, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IUserRoleRepository repository;
}
