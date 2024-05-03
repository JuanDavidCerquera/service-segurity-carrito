package com.example.segurityshoppingcart.Parameter.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Parameter.Entity.Neighborhood;
import com.example.segurityshoppingcart.Parameter.IService.INeighborhoodService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/neighborhood")
public class NeighborhoodController extends ABaseController<Neighborhood, INeighborhoodService>{
    protected NeighborhoodController(INeighborhoodService service) {
        super(service, "neighborhood");
     
    }

    
}
