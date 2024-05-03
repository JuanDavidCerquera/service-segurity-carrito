package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Store;
import com.example.segurityshoppingcart.Operational.Store.IService.IStoreService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/store")
public class StoreController extends ABaseController<Store, IStoreService>{

	protected StoreController(IStoreService service) {
		super(service, "store");
	}

}
