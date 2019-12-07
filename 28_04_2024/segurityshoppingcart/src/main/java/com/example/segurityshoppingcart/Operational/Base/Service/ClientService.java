package com.example.segurityshoppingcart.Operational.Base.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Base.Entity.Client;
import com.example.segurityshoppingcart.Operational.Base.IRepository.IClientRepository;
import com.example.segurityshoppingcart.Operational.Base.IService.IClientService;

@Service
public class ClientService extends ABaseService<Client> implements IClientService{

	@Override
	protected IBaseRepository<Client, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IClientRepository repository;

}
