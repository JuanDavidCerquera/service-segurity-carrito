package com.example.segurityshoppingcart.Utils.IService;

import com.example.segurityshoppingcart.Utils.Enum.Days;
import com.example.segurityshoppingcart.Utils.Enum.Months;
import com.example.segurityshoppingcart.Utils.Enum.Address;
import com.example.segurityshoppingcart.Utils.Enum.TypeDocument;

public interface IEnumService {

	Days[] getDays();
	Months[] getMonths();
	Address[] getAddress();
	TypeDocument[] getTypeDocument();
	
}
