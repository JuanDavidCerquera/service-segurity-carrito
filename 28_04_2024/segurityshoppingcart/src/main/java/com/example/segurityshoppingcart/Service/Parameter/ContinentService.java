package com.example.segurityshoppingcart.Service.Parameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Parameter.Continent;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Parameter.IContinentRepository;
import com.example.segurityshoppingcart.IService.Parameter.IContinentService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class ContinentService extends ABaseService<Continent> implements IContinentService{

	@Override
	protected IBaseRepository<Continent, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Autowired
	public  IContinentRepository repository;
	


}
