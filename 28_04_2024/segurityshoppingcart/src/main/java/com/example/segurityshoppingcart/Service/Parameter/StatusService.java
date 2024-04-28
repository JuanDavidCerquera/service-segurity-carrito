package com.example.segurityshoppingcart.Service.Parameter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Parameter.Status;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Parameter.IStatusRepository;
import com.example.segurityshoppingcart.IService.Parameter.IStatusService;
import com.example.segurityshoppingcart.Service.ABaseService;


@Service
public class StatusService  extends ABaseService<Status> implements IStatusService{

	
	@Autowired
	public IStatusRepository repository;



	@Override
	protected IBaseRepository<Status, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
}

