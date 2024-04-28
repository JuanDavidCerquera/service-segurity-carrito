package com.example.segurityshoppingcart.Service.Parameter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Parameter.Country;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Parameter.ICountryRepository;
import com.example.segurityshoppingcart.IService.Parameter.ICountryService;
import com.example.segurityshoppingcart.Service.ABaseService;



@Service
public class CountrysService extends ABaseService<Country> implements ICountryService {

	@Override
	protected IBaseRepository<Country, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

    @Autowired
    public ICountryRepository repository;



}
