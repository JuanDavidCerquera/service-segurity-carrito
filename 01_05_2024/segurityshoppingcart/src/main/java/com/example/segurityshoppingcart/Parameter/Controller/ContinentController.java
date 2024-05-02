package com.example.segurityshoppingcart.Parameter.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Parameter.Entity.Continent;
import com.example.segurityshoppingcart.Parameter.IService.IContinentService;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/continent")
public class ContinentController extends ABaseController<Continent, IContinentService>{
    public ContinentController(IContinentService service){
        super(service, "Continent");
    }
}
