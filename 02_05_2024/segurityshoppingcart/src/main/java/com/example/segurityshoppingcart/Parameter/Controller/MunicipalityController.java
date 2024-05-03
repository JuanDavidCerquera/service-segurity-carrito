package com.example.segurityshoppingcart.Parameter.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Parameter.Entity.Municipality;
import com.example.segurityshoppingcart.Parameter.IService.IMunicipalityService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/minucipality")
public class MunicipalityController extends ABaseController<Municipality, IMunicipalityService>{
    public MunicipalityController(IMunicipalityService service){
        super(service , "municipality");
    }
    
}
