package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.ViewModule;
import com.example.segurityshoppingcart.IService.Segurity.IViewModuleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/viewmodule")
public class ViewModuleController extends ABaseController<ViewModule, IViewModuleService>{
    public ViewModuleController(IViewModuleService service){
        super(service, "viewmodule");
    }


}
