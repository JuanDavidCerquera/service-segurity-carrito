package com.example.segurityshoppingcart.Operational.Store.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Store.Entity.Inventory;
import com.example.segurityshoppingcart.Operational.Store.IService.IInventoryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/inventory")
public class InventoryController extends ABaseController<Inventory, IInventoryService>{

	protected InventoryController(IInventoryService service) {
		super(service, "inventory");
	}

}
