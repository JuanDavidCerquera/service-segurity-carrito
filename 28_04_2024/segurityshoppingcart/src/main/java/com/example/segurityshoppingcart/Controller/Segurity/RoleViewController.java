package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.RoleView;
import com.example.segurityshoppingcart.IService.Segurity.IRoleViewService;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/user")
public class RoleViewController extends ABaseController<RoleView, IRoleViewService>{

    protected RoleViewController(IRoleViewService service) {
        super(service, "roleview");
    }
    
}
