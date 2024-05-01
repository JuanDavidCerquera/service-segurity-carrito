package com.example.segurityshoppingcart.Segurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Segurity.Entity.Person;
import com.example.segurityshoppingcart.Segurity.IRepository.IPersonRepository;
import com.example.segurityshoppingcart.Segurity.IService.IPersonService;

@Service
public class PersonService extends ABaseService<Person> implements IPersonService{
    	@Override
	protected IBaseRepository<Person, Long> getRepository() {
		return repository;
	}
     
    @Autowired
    public IPersonRepository repository;

}
