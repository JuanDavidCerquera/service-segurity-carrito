package com.example.segurityshoppingcart.Operational.Store.IRepository;


import org.springframework.stereotype.Repository;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Operational.Store.Entity.Inventory;


@Repository
public interface IInventoryRepository extends IBaseRepository<Inventory, Long>{

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
//			+ "where bd.id = :detailId", nativeQuery =true)
//	List<IDetailsDto> getDetails(@Param("detailId") Long detailId);
//	
	

	
}
