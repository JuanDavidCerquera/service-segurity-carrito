package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Supplies;
import com.example.segurityshoppingcart.Operational.Store.IService.ISuppliesService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("v1/api/supplies")
public class SuppliesController extends ABaseController<Supplies, ISuppliesService>{

	protected SuppliesController(ISuppliesService service) {
		super(service, "supplies");
	}

}
