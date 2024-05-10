package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.SuppliesProduct;
import com.example.segurityshoppingcart.Operational.Store.IRepository.ISuppliesProductRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.ISuppliesProductService;

@Service
public class SuppliesProductService extends ABaseService<SuppliesProduct> implements ISuppliesProductService{

	@Override
	protected IBaseRepository<SuppliesProduct, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private ISuppliesProductRepository repository;

	@Override
	protected Class<SuppliesProduct> getEntityClass() {
		return SuppliesProduct.class;
	}

}
