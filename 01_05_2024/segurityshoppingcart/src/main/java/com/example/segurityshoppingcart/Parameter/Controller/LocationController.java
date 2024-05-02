package com.example.segurityshoppingcart.Parameter.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Parameter.Entity.Location;
import com.example.segurityshoppingcart.Parameter.IService.ILocationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/location")
public class LocationController extends ABaseController<Location, ILocationService>{
    public LocationController(ILocationService service){
        super(service, "location");
    }
    
}
