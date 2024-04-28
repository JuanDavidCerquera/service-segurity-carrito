package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.UserRole;
import com.example.segurityshoppingcart.IService.Segurity.IUserRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/userrole")
public class UserRoleController extends ABaseController<UserRole,IUserRoleService>{
	public UserRoleController(IUserRoleService service) {
        super(service, "UserRole");
    }
}
