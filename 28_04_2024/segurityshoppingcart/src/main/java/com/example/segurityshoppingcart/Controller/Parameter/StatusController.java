package com.example.segurityshoppingcart.Controller.Parameter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Controller.ABaseController;
import com.example.segurityshoppingcart.Entity.Parameter.Status;
import com.example.segurityshoppingcart.IService.Parameter.IStatusService;

import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/status")
public class StatusController extends ABaseController<Status, IStatusService>{
    public StatusController(IStatusService service){
        super(service, "status");
    }
    
}
