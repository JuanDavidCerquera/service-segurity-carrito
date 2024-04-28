package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.ViewModule;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IViewModuleRepository;
import com.example.segurityshoppingcart.IService.Segurity.IViewModuleService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class ViewModuleService  extends ABaseService<ViewModule> implements IViewModuleService{
        @Override
protected IBaseRepository<ViewModule, Long> getRepository() {
return repository;
}

@Autowired
public IViewModuleRepository repository;
}
