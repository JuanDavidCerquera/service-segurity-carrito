package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.SuppliesProduct;
import com.example.segurityshoppingcart.Operational.Store.IService.ISuppliesProductService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("v1/api/suppliesproduct")
public class SuppliesProductController extends ABaseController<SuppliesProduct, ISuppliesProductService>{

	protected SuppliesProductController(ISuppliesProductService service) {
		super(service, "suppliesproduct");
	}

}
