package com.example.segurityshoppingcart.Segurity.IRepository;

import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Segurity.Entity.Person;


@Repository
public interface IPersonRepository extends IBaseRepository<Person,Long>{
    
	
	/*
	@Query(value= "", nativeQuery = true)
	Person getFyndMunicipality();
	*/
}
