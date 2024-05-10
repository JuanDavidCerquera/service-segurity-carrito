package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Supplies;
import com.example.segurityshoppingcart.Operational.Store.IRepository.ISuppliesRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.ISuppliesService;

@Service
public class SuppliesService extends ABaseService<Supplies> implements ISuppliesService{

	@Override
	protected IBaseRepository<Supplies, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private ISuppliesRepository repository;

	@Override
	protected Class<Supplies> getEntityClass() {
		return Supplies.class;
	}

}
