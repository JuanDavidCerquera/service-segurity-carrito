package com.example.segurityshoppingcart.Parameter.Entity;


import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Status")
public class Status extends ABaseEntity{
	@Column(name = "code")
    private String code;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "description")
    private String description;
	
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	   	@JoinColumn(name = "country_id", nullable = false)
	       private Country country;
	 
	 

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
