package com.example.segurityshoppingcart.Parameter.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Parameter.Entity.Location;
import com.example.segurityshoppingcart.Parameter.IRepository.ILocationRepository;
import com.example.segurityshoppingcart.Parameter.IService.ILocationService;





@Service
public class LocationService extends ABaseService<Location> implements ILocationService {

  

    @Override
    protected IBaseRepository<Location, Long> getRepository() {
        return repository;
    }
    
    @Autowired
    public ILocationRepository repository;

	@Override
	protected Class<Location> getEntityClass() {
		return Location.class;
	}

}
