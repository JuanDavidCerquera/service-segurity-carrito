package com.example.segurityshoppingcart.Utils.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Utils.Enum.Days;
import com.example.segurityshoppingcart.Utils.Enum.Months;
import com.example.segurityshoppingcart.Utils.Enum.Address;
import com.example.segurityshoppingcart.Utils.Enum.TypeDocument;
import com.example.segurityshoppingcart.Utils.IService.IEnumService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/enum")
public class EnumController{
	
	@Autowired
	private IEnumService service;
	
	@GetMapping("/Days")
	public Days[] getDays() {
		return service.getDays();
	}
	
	@GetMapping("/Months")
	public Months[] getMonths() {
		return service.getMonths();
	}
	
	@GetMapping("/Address")
	public Address[] getAddress() {
		return service.getAddress();
	}
	
	@GetMapping("/TypeDocument")
	public TypeDocument[] getTypeDocument() {
		return service.getTypeDocument();
	}


}
