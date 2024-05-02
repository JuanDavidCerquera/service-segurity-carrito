package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.BillDetails;
import com.example.segurityshoppingcart.Operational.Store.IService.IBillDetailsService;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("v1/api/billDetails")
public class BillDetailsController extends ABaseController<BillDetails, IBillDetailsService>{

	protected BillDetailsController(IBillDetailsService service) {
		super(service, "billDetails");
	}

}
