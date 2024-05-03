package com.example.segurityshoppingcart.Operational.Store.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory extends ABaseEntity{
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "supplies_id")
	private Supplies supplies;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id")
	private Store store;
	
	@Column(name = "amount")private Double amount;

	public Supplies getSupplies() {
		return supplies;
	}

	public void setSupplies(Supplies supplies) {
		this.supplies = supplies;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
