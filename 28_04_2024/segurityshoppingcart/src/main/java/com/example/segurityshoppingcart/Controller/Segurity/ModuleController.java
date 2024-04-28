package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.Modules;
import com.example.segurityshoppingcart.IService.Segurity.IModuleService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module")
public class ModuleController extends ABaseController<Modules,IModuleService>{
	public ModuleController(IModuleService service) {
        super(service, "Module");
    }
}
