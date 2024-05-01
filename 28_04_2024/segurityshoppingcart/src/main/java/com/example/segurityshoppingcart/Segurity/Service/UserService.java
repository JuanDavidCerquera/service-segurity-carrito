package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.User;
import com.example.segurityshoppingcart.Segurity.IRepository.IUserRepository;
import com.example.segurityshoppingcart.Segurity.IService.IUserService;

@Service
public class UserService extends ABaseService<User> implements IUserService{
    @Override
protected IBaseRepository<User, Long> getRepository() {
return repository;
}

@Autowired
public IUserRepository repository;
}