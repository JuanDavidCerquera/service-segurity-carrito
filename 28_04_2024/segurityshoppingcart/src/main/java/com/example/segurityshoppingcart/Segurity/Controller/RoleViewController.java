package com.example.segurityshoppingcart.Segurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Segurity.Entity.RoleView;
import com.example.segurityshoppingcart.Segurity.IService.IRoleViewService;

import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roleView")
public class RoleViewController extends ABaseController<RoleView, IRoleViewService>{

    protected RoleViewController(IRoleViewService service) {
        super(service, "roleview");
    }
    
}
