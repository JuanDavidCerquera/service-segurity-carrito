package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Store;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IStoreRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IStoreService;

@Service
public class StoreService extends ABaseService<Store> implements IStoreService{

	@Override
	protected IBaseRepository<Store, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IStoreRepository repository;

	@Override
	protected Class<Store> getEntityClass() {
		return Store.class;
	}

}
