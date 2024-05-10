package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Product;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IProductRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IProductService;

@Service
public class ProductService extends ABaseService<Product> implements IProductService{

	@Override
	protected IBaseRepository<Product, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IProductRepository repository;

	@Override
	protected Class<Product> getEntityClass() {
		return Product.class;
	}

}
