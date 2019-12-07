package com.example.segurityshoppingcart.Operational.Bookshop.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Bookshop.Entity.Library;
import com.example.segurityshoppingcart.Operational.Bookshop.IService.ILibraryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/library")
public class LibraryController extends ABaseController<Library, ILibraryService>{

	protected LibraryController(ILibraryService service) {
		super(service, "library");
	}

}
