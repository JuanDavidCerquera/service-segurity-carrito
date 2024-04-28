package com.example.segurityshoppingcart.Service.Parameter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Parameter.Municipality;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Parameter.IMunicipalityRepository;
import com.example.segurityshoppingcart.IService.Parameter.IMunicipalityService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class MunicipalityService extends ABaseService<Municipality> implements IMunicipalityService{

	@Override
	protected IBaseRepository<Municipality, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	@Autowired
	private IMunicipalityRepository repository;

	
}
