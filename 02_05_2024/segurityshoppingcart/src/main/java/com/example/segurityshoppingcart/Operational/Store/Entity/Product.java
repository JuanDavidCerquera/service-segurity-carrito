package com.example.segurityshoppingcart.Operational.Store.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends ABaseEntity{
	
	@Column(name = "price")private Double prive;
	@Column(name ="code")private String code;
	@Column(name = "name")private String name;
	public Double getPrive() {
		return prive;
	}
	public void setPrive(Double prive) {
		this.prive = prive;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
