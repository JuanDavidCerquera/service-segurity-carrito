package com.example.segurityshoppingcart.Parameter.Entity;


import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Continent")
public class Continent extends ABaseEntity{
	

	  @Column(name = "name")
	    private String name;
	    
	@Column(name = "code")
	    private String code;
	
	@Column(name = "description")
    private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	



}
