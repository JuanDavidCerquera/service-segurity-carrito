package com.example.segurityshoppingcart.Parameter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Parameter.Entity.Municipality;
import com.example.segurityshoppingcart.Parameter.IRepository.IMunicipalityRepository;
import com.example.segurityshoppingcart.Parameter.IService.IMunicipalityService;

@Service
public class MunicipalityService extends ABaseService<Municipality> implements IMunicipalityService{

	@Override
	protected IBaseRepository<Municipality, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	@Autowired
	private IMunicipalityRepository repository;

	@Override
	protected Class<Municipality> getEntityClass() {
		return Municipality.class;
	}

	
}
