package com.example.segurityshoppingcart.Operational.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Entity.Employed;
import com.example.segurityshoppingcart.Operational.IService.IEmployedService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/employed")
public class EmployedController extends ABaseController<Employed, IEmployedService>{

	protected EmployedController(IEmployedService service) {
		super(service, "Employed");
	}

}
