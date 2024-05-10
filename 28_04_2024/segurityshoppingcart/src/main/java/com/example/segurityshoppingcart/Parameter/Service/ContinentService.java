package com.example.segurityshoppingcart.Parameter.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Parameter.Entity.Continent;
import com.example.segurityshoppingcart.Parameter.IRepository.IContinentRepository;
import com.example.segurityshoppingcart.Parameter.IService.IContinentService;

@Service
public class ContinentService extends ABaseService<Continent> implements IContinentService{

	@Override
	protected IBaseRepository<Continent, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Autowired
	public  IContinentRepository repository;

	@Override
	protected Class<Continent> getEntityClass() {
		return Continent.class;
	}
	


}
