package com.example.segurityshoppingcart.Operational.Store.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Store.Entity.Product;

@Repository
public interface IProductRepository extends IBaseRepository<Product, Long>{

}
