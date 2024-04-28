package com.example.segurityshoppingcart.IRepository.Parameter;


import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Parameter.Municipality;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface IMunicipalityRepository extends IBaseRepository<Municipality, Long> {

}
