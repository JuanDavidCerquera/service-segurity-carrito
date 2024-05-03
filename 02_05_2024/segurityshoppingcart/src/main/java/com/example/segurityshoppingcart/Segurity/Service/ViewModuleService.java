package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.ViewModule;
import com.example.segurityshoppingcart.Segurity.IRepository.IViewModuleRepository;
import com.example.segurityshoppingcart.Segurity.IService.IViewModuleService;

@Service
public class ViewModuleService  extends ABaseService<ViewModule> implements IViewModuleService{
        @Override
protected IBaseRepository<ViewModule, Long> getRepository() {
return repository;
}

@Autowired
public IViewModuleRepository repository;
}
