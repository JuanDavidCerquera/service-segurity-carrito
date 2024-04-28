package com.example.segurityshoppingcart.Controller.Segurity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Segurity.Person;
import com.example.segurityshoppingcart.IService.Segurity.IPersonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/person")
public class PersonController extends ABaseController<Person,IPersonService>{
	public PersonController(IPersonService service) {
        super(service, "Person");
        
    }
}
