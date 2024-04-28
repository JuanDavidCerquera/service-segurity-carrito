package com.example.segurityshoppingcart.Service.Parameter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Parameter.Location;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Parameter.ILocationRepository;
import com.example.segurityshoppingcart.IService.Parameter.ILocationService;
import com.example.segurityshoppingcart.Service.ABaseService;





@Service
public class LocationService extends ABaseService<Location> implements ILocationService {

  

    @Override
    protected IBaseRepository<Location, Long> getRepository() {
        return repository;
    }
    
    @Autowired
    public ILocationRepository repository;

}
