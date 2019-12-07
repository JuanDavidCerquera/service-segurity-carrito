package com.example.segurityshoppingcart.Operational.Base.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Operational.Base.Entity.Client;
import com.example.segurityshoppingcart.Operational.Base.IService.IClientService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Client")
public class ClientController extends ABaseController<Client, IClientService>{

	protected ClientController(IClientService service) {
		super(service, "Client");
	}

}
