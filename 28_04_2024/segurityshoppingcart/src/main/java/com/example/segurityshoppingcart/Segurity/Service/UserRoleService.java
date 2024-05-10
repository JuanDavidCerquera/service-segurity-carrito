package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.UserRole;
import com.example.segurityshoppingcart.Segurity.IRepository.IUserRoleRepository;
import com.example.segurityshoppingcart.Segurity.IService.IUserRoleService;

@Service
public class UserRoleService extends ABaseService<UserRole> implements IUserRoleService{
           	@Override
	protected IBaseRepository<UserRole, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IUserRoleRepository repository;

	@Override
	protected Class<UserRole> getEntityClass() {
		return UserRole.class;
	}
}
