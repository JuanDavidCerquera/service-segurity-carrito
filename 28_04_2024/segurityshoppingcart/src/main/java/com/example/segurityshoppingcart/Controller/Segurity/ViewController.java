package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.View;
import com.example.segurityshoppingcart.IService.Segurity.IViewService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/view")
public class ViewController extends ABaseController<View,IViewService>{
	public ViewController(IViewService service) {
        super(service, "View");
    }
	
}
