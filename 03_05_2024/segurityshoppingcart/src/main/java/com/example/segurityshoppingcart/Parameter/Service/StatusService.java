package com.example.segurityshoppingcart.Parameter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Parameter.Entity.Status;
import com.example.segurityshoppingcart.Parameter.IRepository.IStatusRepository;
import com.example.segurityshoppingcart.Parameter.IService.IStatusService;


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

