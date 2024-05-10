package com.example.segurityshoppingcart.Parameter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Parameter.Entity.Neighborhood;
import com.example.segurityshoppingcart.Parameter.IRepository.INeighborhoodRepository;
import com.example.segurityshoppingcart.Parameter.IService.INeighborhoodService;


@Service
public class NeighborhoodService extends ABaseService<Neighborhood> implements INeighborhoodService{

	@Override
	protected IBaseRepository<Neighborhood, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Autowired
	public INeighborhoodRepository repository;

	@Override
	protected Class<Neighborhood> getEntityClass() {
		return Neighborhood.class;
	}



}
