package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.View;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IViewRepository;
import com.example.segurityshoppingcart.IService.Segurity.IViewService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class ViewService extends ABaseService<View> implements IViewService{
    @Override
protected IBaseRepository<View, Long> getRepository() {
return repository;
}

@Autowired
public IViewRepository repository;
}
