package com.example.segurityshoppingcart.Segurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Segurity.Entity.UserRole;
import com.example.segurityshoppingcart.Segurity.IService.IUserRoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/userrole")
public class UserRoleController extends ABaseController<UserRole,IUserRoleService>{
	public UserRoleController(IUserRoleService service) {
        super(service, "UserRole");
    }
}
