package com.example.segurityshoppingcart.Parameter.IRepository;


import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Parameter.Entity.Municipality;

@Repository
public interface IMunicipalityRepository extends IBaseRepository<Municipality, Long> {

}
