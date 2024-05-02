package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.View;
import com.example.segurityshoppingcart.Segurity.IRepository.IViewRepository;
import com.example.segurityshoppingcart.Segurity.IService.IViewService;

@Service
public class ViewService extends ABaseService<View> implements IViewService{
    @Override
protected IBaseRepository<View, Long> getRepository() {
return repository;
}

@Autowired
public IViewRepository repository;
}
