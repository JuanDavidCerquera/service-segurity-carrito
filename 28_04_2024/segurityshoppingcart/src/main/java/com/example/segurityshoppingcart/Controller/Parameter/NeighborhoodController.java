package com.example.segurityshoppingcart.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Parameter.Neighborhood;
import com.example.segurityshoppingcart.IService.Parameter.INeighborhoodService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/neighborhood")
public class NeighborhoodController extends ABaseController<Neighborhood, INeighborhoodService>{
    protected NeighborhoodController(INeighborhoodService service) {
        super(service, "neighborhood");
        //TODO Auto-generated constructor stub
    }

    
}
