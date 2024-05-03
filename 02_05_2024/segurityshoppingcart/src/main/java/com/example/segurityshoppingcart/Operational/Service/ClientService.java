package com.example.segurityshoppingcart.Operational.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Entity.Client;
import com.example.segurityshoppingcart.Operational.IRepository.IClientRepository;
import com.example.segurityshoppingcart.Operational.IService.IClientService;

@Service
public class ClientService extends ABaseService<Client> implements IClientService{

	@Override
	protected IBaseRepository<Client, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IClientRepository repository;

}
