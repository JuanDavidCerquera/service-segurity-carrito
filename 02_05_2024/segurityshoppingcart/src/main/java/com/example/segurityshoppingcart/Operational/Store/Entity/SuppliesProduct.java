package com.example.segurityshoppingcart.Operational.Store.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suppliesproduct")
public class SuppliesProduct extends ABaseEntity{
	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "supplies_id")
	private Supplies supplies;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "unitmeasure_id")
	private Unitmeasure unitmeasure;
	
	@Column(name = "amount")private int amount;

	
	
	
	
	
	public Unitmeasure getUnitmeasure() {
		return unitmeasure;
	}

	public void setUnitmeasure(Unitmeasure unitmeasure) {
		this.unitmeasure = unitmeasure;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplies getSupplies() {
		return supplies;
	}

	public void setSupplies(Supplies supplies) {
		this.supplies = supplies;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	
}
