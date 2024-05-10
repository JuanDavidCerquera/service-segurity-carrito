package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.Modules;
import com.example.segurityshoppingcart.Segurity.IRepository.IModuleRepository;
import com.example.segurityshoppingcart.Segurity.IService.IModuleService;

@Service
public class ModuleService extends ABaseService<Modules> implements IModuleService{
       	@Override
	protected IBaseRepository<Modules, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IModuleRepository repository;

	@Override
	protected Class<Modules> getEntityClass() {
		return Modules.class;
	}

}
