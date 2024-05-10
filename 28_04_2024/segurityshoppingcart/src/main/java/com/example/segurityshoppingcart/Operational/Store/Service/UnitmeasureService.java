package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Unitmeasure;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IUnitmeasureRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IUnitmeasureService;

@Service
public class UnitmeasureService extends ABaseService<Unitmeasure> implements IUnitmeasureService{

	@Override
	protected IBaseRepository<Unitmeasure, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IUnitmeasureRepository repository;

	@Override
	protected Class<Unitmeasure> getEntityClass() {
		return Unitmeasure.class;
	}

}
