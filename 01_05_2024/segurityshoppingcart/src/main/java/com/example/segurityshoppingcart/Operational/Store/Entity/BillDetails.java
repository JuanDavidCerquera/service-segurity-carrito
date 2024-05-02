package com.example.segurityshoppingcart.Operational.Store.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="facturaDetalle")
public class BillDetails extends ABaseEntity{
	
	@Column(name ="code")private String code;
	@Column(name ="amount")private int amount;
	@Column(name ="price")private Double Price;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "factura_id")
	private Bill bill;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Product product;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	

	
}
