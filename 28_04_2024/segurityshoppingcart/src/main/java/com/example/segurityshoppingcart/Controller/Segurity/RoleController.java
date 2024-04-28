package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.Role;
import com.example.segurityshoppingcart.IService.Segurity.IRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/role")
public class RoleController extends ABaseController<Role,IRoleService>{
	public RoleController(IRoleService service) {
        super(service, "Role");
    }
	
}
