package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.User;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IUserRepository;
import com.example.segurityshoppingcart.IService.Segurity.IUserService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class UserService extends ABaseService<User> implements IUserService{
    @Override
protected IBaseRepository<User, Long> getRepository() {
return repository;
}

@Autowired
public IUserRepository repository;
}