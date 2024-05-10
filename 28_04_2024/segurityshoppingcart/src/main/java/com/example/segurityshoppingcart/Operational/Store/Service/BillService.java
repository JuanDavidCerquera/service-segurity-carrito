package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Bill;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IBillRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IBillService;

@Service
public class BillService extends ABaseService<Bill> implements IBillService{

	@Override
	protected IBaseRepository<Bill, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IBillRepository repository;

	@Override
	protected Class<Bill> getEntityClass() {
		return Bill.class;
	}

}
