package com.example.segurityshoppingcart.Operational.Store.Controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.segurityshoppingcart.Base.Controller.ABaseController;
import com.example.segurityshoppingcart.Base.DTO.ApiResponseDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.IPriceTotalBillDto;
import com.example.segurityshoppingcart.Operational.Store.Entity.BillDetails;
import com.example.segurityshoppingcart.Operational.Store.IService.IBillDetailsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/billdetails")
public class BillDetailsController extends ABaseController<BillDetails, IBillDetailsService>{

	protected BillDetailsController(IBillDetailsService service) {
		super(service, "billDetails");
		
	}
    @PutMapping("/price/{id}")
    public ResponseEntity<ApiResponseDto<IPriceTotalBillDto>> setprice(@PathVariable Long id) {
        try {
            service.setPriceBill(id);
            return ResponseEntity.ok(new ApiResponseDto<IPriceTotalBillDto>("Datos actualizados", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<IPriceTotalBillDto>(e.getMessage(), null, false));
        }
    }
    @GetMapping("/price/{id}")
    public ResponseEntity<ApiResponseDto<Optional<IPriceTotalBillDto>>> getBillPrice(@PathVariable Long id) {
        try {
            Optional<IPriceTotalBillDto> entity = service.getBilldetailsByBill(id);
            return ResponseEntity.ok(new ApiResponseDto<Optional<IPriceTotalBillDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<Optional<IPriceTotalBillDto>>(e.getMessage(), null, false));
        }
    }

}
