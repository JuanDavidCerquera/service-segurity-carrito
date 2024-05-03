package com.example.segurityshoppingcart.Segurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Segurity.Entity.Modules;
import com.example.segurityshoppingcart.Segurity.IService.IModuleService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module")
public class ModuleController extends ABaseController<Modules,IModuleService>{
	public ModuleController(IModuleService service) {
        super(service, "Module");
    }
}
