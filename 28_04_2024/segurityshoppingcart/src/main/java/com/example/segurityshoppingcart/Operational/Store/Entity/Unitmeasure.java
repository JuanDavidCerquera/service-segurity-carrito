package com.example.segurityshoppingcart.Operational.Store.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "unitmeasure")
public class Unitmeasure extends ABaseEntity{
	@Column(name ="code")private String code;
	@Column(name ="name")private String name;

	
}
