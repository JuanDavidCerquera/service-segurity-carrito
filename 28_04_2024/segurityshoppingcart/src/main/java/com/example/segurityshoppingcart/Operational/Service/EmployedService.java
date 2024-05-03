package com.example.segurityshoppingcart.Operational.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Entity.Employed;
import com.example.segurityshoppingcart.Operational.IRepository.IEmployedRepository;
import com.example.segurityshoppingcart.Operational.IService.IEmployedService;

@Service
public class EmployedService extends ABaseService<Employed> implements IEmployedService{

	@Override
	protected IBaseRepository<Employed, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IEmployedRepository repository;
}
