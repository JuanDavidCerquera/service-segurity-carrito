package com.example.segurityshoppingcart.Segurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.AGenericController;
import com.example.segurityshoppingcart.Segurity.Entity.Person;
import com.example.segurityshoppingcart.Segurity.IService.IPersonService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/person")
public class PersonController extends AGenericController<Person,IPersonService>{
	public PersonController(IPersonService service) {
        super(service, "Person");
        
    }
}
