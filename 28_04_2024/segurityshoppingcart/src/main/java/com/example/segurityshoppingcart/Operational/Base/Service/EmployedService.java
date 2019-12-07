package com.example.segurityshoppingcart.Operational.Base.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Base.Entity.Employed;
import com.example.segurityshoppingcart.Operational.Base.IRepository.IEmployedRepository;
import com.example.segurityshoppingcart.Operational.Base.IService.IEmployedService;

@Service
public class EmployedService extends ABaseService<Employed> implements IEmployedService{

	@Override
	protected IBaseRepository<Employed, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IEmployedRepository repository;
}
