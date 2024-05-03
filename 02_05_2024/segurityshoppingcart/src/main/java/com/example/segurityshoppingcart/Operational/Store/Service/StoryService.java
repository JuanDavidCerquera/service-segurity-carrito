package com.example.segurityshoppingcart.Operational.Store.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.Entity.Story;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IStoryRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IStoryService;

@Service
public class StoryService extends ABaseService<Story> implements IStoryService{

	@Override
	protected IBaseRepository<Story, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IStoryRepository repository;
}
