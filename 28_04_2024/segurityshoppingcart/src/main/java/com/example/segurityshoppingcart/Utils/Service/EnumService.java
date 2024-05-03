package com.example.segurityshoppingcart.Utils.Service;

import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Utils.Enum.Days;
import com.example.segurityshoppingcart.Utils.Enum.Months;
import com.example.segurityshoppingcart.Utils.Enum.Address;
import com.example.segurityshoppingcart.Utils.Enum.TypeDocument;
import com.example.segurityshoppingcart.Utils.IService.IEnumService;

@Service
public class EnumService implements IEnumService{

	@Override
	public Days[] getDays() {
		return Days.values();
	}

	@Override
	public Months[] getMonths() {
		return Months.values();
	}

	@Override
	public Address[] getAddress() {
		return Address.values();
	}

	@Override
	public TypeDocument[] getTypeDocument() {
		return TypeDocument.values();
	}
	
	

	
}
