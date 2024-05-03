package com.example.segurityshoppingcart.Parameter.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Parameter.Entity.Country;
import com.example.segurityshoppingcart.Parameter.IService.ICountryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/country")
public class CountryController extends ABaseController<Country, ICountryService>{

    protected CountryController(ICountryService service) {
        super(service, "country");
    }

    
}
