package com.example.segurityshoppingcart.Operational.Store.IService;

import java.util.List;
import java.util.Optional;


import com.example.segurityshoppingcart.Base.IService.IBaseService;
import com.example.segurityshoppingcart.Operational.Store.DTO.IBillDetailIdDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.IPriceTotalBillDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.InventoryDto;
import com.example.segurityshoppingcart.Operational.Store.Entity.BillDetails;

public interface IBillDetailsService  extends IBaseService<BillDetails>{

	Optional<IPriceTotalBillDto> getBilldetailsByBill(Long id);
	public void setPriceBill(Long id) throws Exception;
//	List<IDetailsDto> getDetails(Long detailId) throws Exception;


	Optional<IBillDetailIdDto> getIdBillDetails(Long id);
	List<InventoryDto> getDetailsInventory(Long id);
}
