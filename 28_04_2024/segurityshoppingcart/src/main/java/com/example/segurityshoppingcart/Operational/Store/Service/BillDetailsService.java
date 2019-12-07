package com.example.segurityshoppingcart.Operational.Store.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segurityshoppingcart.Base.IRepository.IBaseRepository;
import com.example.segurityshoppingcart.Base.Service.ABaseService;
import com.example.segurityshoppingcart.Operational.Store.DTO.IBillDetailIdDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.IPriceTotalBillDto;
import com.example.segurityshoppingcart.Operational.Store.DTO.InventoryDto;
import com.example.segurityshoppingcart.Operational.Store.Entity.Bill;
import com.example.segurityshoppingcart.Operational.Store.Entity.BillDetails;
import com.example.segurityshoppingcart.Operational.Store.Entity.Inventory;
import com.example.segurityshoppingcart.Operational.Store.IRepository.IBillDetailsRepository;
import com.example.segurityshoppingcart.Operational.Store.IService.IBillDetailsService;
import com.example.segurityshoppingcart.Operational.Store.IService.IInventoryService;

@Service
public class BillDetailsService extends ABaseService<BillDetails> implements IBillDetailsService{

	@Override
	protected IBaseRepository<BillDetails, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IBillDetailsRepository repository;
	
	@Autowired
	private BillService billService;

	@Autowired
	private IInventoryService InventoryService;

	@Override
	public Optional<IPriceTotalBillDto> getBilldetailsByBill(Long id) {
		return repository.getBilldetailsByBill(id);
	}

	@Override
	public void setPriceBill(Long id) throws Exception {
	    Optional<Bill> opBill = billService.findById(id);
	    
	    if (opBill.isEmpty()) {
	        throw new Exception("Factura no encontrada");
	    }
	    
	    Bill bill = opBill.get();
	    
	    if (bill.getDeletedAt() != null) {
	        throw new Exception("La factura está inhabilitada");
	    }
	    
	    Optional<IPriceTotalBillDto> opBillDetails = getBilldetailsByBill(id);
	    
	    if (opBillDetails.isEmpty()) {
	        throw new Exception("No se encontraron detalles de factura para la factura especificada");
	    }
	    Double billDetails = opBillDetails.get().getPrice();
	    bill.setPrice(billDetails);
	    billService.save(bill);
	    
	    Optional<IBillDetailIdDto> opid = getIdBillDetails(id);
	    Long billId = opid.get().getId();
	    updateamount(billId);
	}
	
	    @Override
	    public void update(Long id, BillDetails entity) throws Exception {
	        Optional<BillDetails> op = getRepository().findById(id);
	        
	        if (op.isEmpty()) {
	            throw new Exception("Registro no encontrado");
	        } else if (op.get().getDeletedAt() != null) {
	            throw new Exception("Registro inhabilitado");
	        }

	        BillDetails entityUpdate = op.get();

	        String[] ignoreProperties = { "id", "createdAt", "deletedAt", "createdBy", "deletedBy" };
	        BeanUtils.copyProperties(entity, entityUpdate, ignoreProperties);
	        entityUpdate.setUpdatedAt(LocalDateTime.now());
	        entityUpdate.setUpdatedBy((long)1); //Cuanto esté el loggin, se debe enviar el ID del usuario con Auth
	        getRepository().save(entityUpdate);
	        setPriceBill(id);
	       
	    }

	

		

		    public void updateamount(Long id) throws Exception {
		    try {
		    	List<InventoryDto> details = repository.getDetailsInventory(id);
		    	    for (InventoryDto detail : details) {
		        Optional<Inventory> op = InventoryService.findById(detail.getInventory());
		        if (op.isEmpty()) {
		            throw new Exception("Registro no encontrado");
		        } else if (op.get().getDeletedAt() != null) {
		            throw new Exception("Registro inhabilitado");
		        }

		        Inventory entityUpdate = op.get();
		        
		        var amount = detail.getTotalSupplies();
		        var amountOld = entityUpdate.getAmount();
		        var amountNew = amountOld - amount;
		        
		        entityUpdate.setAmount(amountNew);
		        entityUpdate.setUpdatedAt(LocalDateTime.now());
		        InventoryService.save(entityUpdate);
		    	    }
		    	    }catch (Exception e) {
		            // Captura la excepción
		            throw new Exception("Error al guardar la entidad: " + e.getMessage());
		        }
		    }
	
			@Override
			public List<InventoryDto> getDetailsInventory(Long id) {
				return repository.getDetailsInventory(id);
			}

			@Override
			public Optional<IBillDetailIdDto> getIdBillDetails(Long id) {
				return repository.getIdBillDetails(id);
			}

	
	
}
