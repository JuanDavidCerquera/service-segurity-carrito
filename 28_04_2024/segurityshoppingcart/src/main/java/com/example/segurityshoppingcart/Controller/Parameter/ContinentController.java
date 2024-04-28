package com.example.segurityshoppingcart.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Parameter.Continent;
import com.example.segurityshoppingcart.IService.Parameter.IContinentService;

import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/continent")
public class ContinentController extends ABaseController<Continent, IContinentService>{
    public ContinentController(IContinentService service){
        super(service, "Continent");
    }
}
