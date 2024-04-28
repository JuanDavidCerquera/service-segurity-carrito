package com.example.segurityshoppingcart.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Parameter.Location;
import com.example.segurityshoppingcart.IService.Parameter.ILocationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/location")
public class LocationController extends ABaseController<Location, ILocationService>{
    public LocationController(ILocationService service){
        super(service, "location");
    }
    
}
