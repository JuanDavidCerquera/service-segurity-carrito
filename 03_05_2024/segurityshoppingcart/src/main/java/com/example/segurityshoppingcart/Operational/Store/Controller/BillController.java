package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Bill;
import com.example.segurityshoppingcart.Operational.Store.IService.IBillService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/bill")
public class BillController extends ABaseController<Bill, IBillService>{

	protected BillController(IBillService service) {
		super(service, "bill");
	}

}
