package com.example.segurityshoppingcart.Parameter.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Parameter.Entity.Status;
import com.example.segurityshoppingcart.Parameter.IService.IStatusService;

import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/status")
public class StatusController extends ABaseController<Status, IStatusService>{
    public StatusController(IStatusService service){
        super(service, "status");
    }
    
}
