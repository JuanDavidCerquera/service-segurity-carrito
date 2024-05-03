package com.example.segurityshoppingcart.Parameter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Parameter.Entity.Country;
import com.example.segurityshoppingcart.Parameter.IRepository.ICountryRepository;
import com.example.segurityshoppingcart.Parameter.IService.ICountryService;



@Service
public class CountrysService extends ABaseService<Country> implements ICountryService {

	@Override
	protected IBaseRepository<Country, Long> getRepository() {
	
		return repository;
	}

    @Autowired
    public ICountryRepository repository;



}
