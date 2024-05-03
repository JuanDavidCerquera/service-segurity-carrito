package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Product;
import com.example.segurityshoppingcart.Operational.Store.IService.IProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/product")
public class ProductController extends ABaseController<Product, IProductService>{

	protected ProductController(IProductService service) {
		super(service, "product");
	}

}
