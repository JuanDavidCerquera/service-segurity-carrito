package com.example.segurityshoppingcart.Service.Parameter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Parameter.Neighborhood;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Parameter.INeighborhoodRepository;
import com.example.segurityshoppingcart.IService.Parameter.INeighborhoodService;
import com.example.segurityshoppingcart.Service.ABaseService;


@Service
public class NeighborhoodService extends ABaseService<Neighborhood> implements INeighborhoodService{

	@Override
	protected IBaseRepository<Neighborhood, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Autowired
	public INeighborhoodRepository repository;



}
