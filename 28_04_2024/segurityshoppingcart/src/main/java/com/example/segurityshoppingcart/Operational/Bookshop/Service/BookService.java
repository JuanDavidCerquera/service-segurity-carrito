package com.example.segurityshoppingcart.Operational.Bookshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Book;
import com.example.segurityshoppingcart.Operational.Bookshop.IRepository.IBookRepository;
import com.example.segurityshoppingcart.Operational.Bookshop.IService.IBookService;

@Service
public class BookService extends ABaseService<Book> implements IBookService{

	@Override
	protected IBaseRepository<Book, Long> getRepository() {
		return repository;
	}
	@Autowired
	private IBookRepository repository;
	@Override
	protected Class<Book> getEntityClass() {
		return Book.class;
	}

}
