package com.example.segurityshoppingcart.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Parameter.Municipality;
import com.example.segurityshoppingcart.IService.Parameter.IMunicipalityService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/minucipality")
public class MunicipalityController extends ABaseController<Municipality, IMunicipalityService>{
    public MunicipalityController(IMunicipalityService service){
        super(service , "municipality");
    }
    
}
