package com.example.segurityshoppingcart.Operational.Store.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Store.Entity.SuppliesProduct;

@Repository
public interface ISuppliesProductRepository extends IBaseRepository<SuppliesProduct, Long>{

}
