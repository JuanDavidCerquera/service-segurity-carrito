package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.Modules;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IModuleRepository;
import com.example.segurityshoppingcart.IService.Segurity.IModuleService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class ModuleService extends ABaseService<Modules> implements IModuleService{
       	@Override
	protected IBaseRepository<Modules, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IModuleRepository repository;

}
