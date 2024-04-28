package com.example.segurityshoppingcart.Service.Segurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Entity.Segurity.Person;
import com.example.segurityshoppingcart.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.IRepository.Segurity.IPersonRepository;
import com.example.segurityshoppingcart.IService.Segurity.IPersonService;
import com.example.segurityshoppingcart.Service.ABaseService;

@Service
public class PersonService extends ABaseService<Person> implements IPersonService{
    	@Override
	protected IBaseRepository<Person, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IPersonRepository repository;

}
