package com.example.segurityshoppingcart.Operational.Bookshop.Service;

import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Library;
import com.example.segurityshoppingcart.Operational.Bookshop.IService.ILibraryService;

@Service
public class LibraryService extends ABaseService<Library> implements ILibraryService{

	@Override
	protected IBaseRepository<Library, Long> getRepository() {
		return null;
	}

}
