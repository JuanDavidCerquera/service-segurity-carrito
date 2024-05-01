package com.example.segurityshoppingcart.Segurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Segurity.Entity.ViewModule;
import com.example.segurityshoppingcart.Segurity.IService.IViewModuleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/viewmodule")
public class ViewModuleController extends ABaseController<ViewModule, IViewModuleService>{
    public ViewModuleController(IViewModuleService service){
        super(service, "viewmodule");
    }


}
