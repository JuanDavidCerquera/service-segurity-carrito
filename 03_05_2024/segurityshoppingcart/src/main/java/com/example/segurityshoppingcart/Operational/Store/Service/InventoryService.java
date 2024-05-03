package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Inventory;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IInventoryRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IInventoryService;

@Service
public class InventoryService extends ABaseService<Inventory> implements IInventoryService{

	@Override
	protected IBaseRepository<Inventory, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IInventoryRepository repository;

}
