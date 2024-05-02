package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.BillDetails;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IBillDetailsRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IBillDetailsService;

@Service
public class BillDetailsService extends ABaseService<BillDetails> implements IBillDetailsService{

	@Override
	protected IBaseRepository<BillDetails, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IBillDetailsRepository repository;

}
