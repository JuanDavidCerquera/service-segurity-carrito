package com.example.segurityshoppingcart.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Parameter.Country;
import com.example.segurityshoppingcart.IService.Parameter.ICountryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/country")
public class CountryController extends ABaseController<Country, ICountryService>{

    protected CountryController(ICountryService service) {
        super(service, "country");
    }

    
}
