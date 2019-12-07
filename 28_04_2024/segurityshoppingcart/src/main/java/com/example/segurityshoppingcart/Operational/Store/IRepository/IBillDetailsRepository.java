package com.example.segurityshoppingcart.Operational.Store.IRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Store.DTO.IBillDetailIdDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.IPriceTotalBillDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.InventoryDto;
import com.example.segurityshoppingcart.Operational.Store.Entity.BillDetails;

@Repository
public interface IBillDetailsRepository extends IBaseRepository<BillDetails, Long>{

	@Query(value="SELECT SUM(bd.price) AS price FROM billdetails AS bd where bd.bill_id = :id", nativeQuery = true)
	Optional<IPriceTotalBillDto> getBilldetailsByBill(@Param("id") Long id);
	
	@Query(value="SELECT id FROM billdetails AS bd where bd.bill_id = :id", nativeQuery = true)
	Optional<IBillDetailIdDto> getIdBillDetails(@Param("id") Long id);

//	@Query(value ="SELECT \r\n"
//			+ "bd.id as detailId,\r\n"
//			+ " p.code AS codeProduct,\r\n"
//			+ " p.name AS nameProduct,\r\n"
//			+ " p.price AS unitPriceProduct,\r\n"
//			+ " bd.amount AS amountProduct,\r\n"
//			+ " bd.price AS priceProduct,\r\n"
//			+ " s.name AS suppliesProduct,\r\n"
//			+ " sp.amount AS suppliesProductt,\r\n"
//			+ " bd.amount * sp.amount AS totalSupplies\r\n"
//			+ " FROM billdetails AS bd\r\n"
//			+ "INNER JOIN product AS p ON p.id = bd.product_id\r\n"
//			+ "INNER JOIN suppliesproduct AS sp ON sp.product_id = p.id\r\n"
//			+ "INNER JOIN supplies AS s ON s.id = sp.supplies_id\r\n"
//			+ "where bd.id = 9", nativeQuery =true)
//	List<IDetailsDto> getDetails(@Param("detailId") Long detailId);
	@Query(value ="SELECT \r\n"
			+ " s.name AS supplies,\r\n"
			+ "   SUM(bd.amount * sp.amount) AS totalSupplies,\r\n"
			+ "   inv.id AS inventory\r\n"
			+ " FROM billdetails AS bd\r\n"
			+ "INNER JOIN product AS p ON p.id = bd.product_id\r\n"
			+ "INNER JOIN suppliesproduct AS sp ON sp.product_id = p.id\r\n"
			+ "INNER JOIN supplies AS s ON s.id = sp.supplies_id\r\n"
			+ "INNER JOIN inventory AS inv ON inv.supplies_id = s.id\r\n"
			+ "WHERE bd.id = :id\r\n"
			+ "GROUP BY s.name, inv.id", nativeQuery =true)
	List<InventoryDto> getDetailsInventory(@Param("id") Long id);
}
