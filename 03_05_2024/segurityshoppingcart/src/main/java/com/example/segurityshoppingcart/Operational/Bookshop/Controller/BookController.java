package com.example.segurityshoppingcart.Operational.Bookshop.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Book;
import com.example.segurityshoppingcart.Operational.Bookshop.IService.IBookService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/book")
public class BookController extends ABaseController<Book, IBookService>{

	protected BookController(IBookService service) {
		super(service, "Book");
		
	}

}
