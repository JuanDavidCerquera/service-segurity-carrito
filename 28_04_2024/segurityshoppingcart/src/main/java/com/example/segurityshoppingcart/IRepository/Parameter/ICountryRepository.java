package com.example.segurityshoppingcart.IRepository.Parameter;


import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Entity.Parameter.Country;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;

@Repository
public interface ICountryRepository extends IBaseRepository<Country, Long> {

}
