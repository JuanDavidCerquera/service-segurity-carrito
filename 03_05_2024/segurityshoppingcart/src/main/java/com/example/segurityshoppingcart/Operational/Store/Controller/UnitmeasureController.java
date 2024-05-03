package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Unitmeasure;
import com.example.segurityshoppingcart.Operational.Store.IService.IUnitmeasureService;

@CrossOrigin(origins= "*")
@RestController
@RequestMapping("v1/api/unitmeasure")
public class UnitmeasureController extends ABaseController<Unitmeasure, IUnitmeasureService>{

	protected UnitmeasureController(IUnitmeasureService service) {
		super(service, "unitmeasure");
	}

}
