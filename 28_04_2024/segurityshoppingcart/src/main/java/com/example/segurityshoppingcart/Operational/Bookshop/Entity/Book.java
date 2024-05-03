package com.example.segurityshoppingcart.Operational.Bookshop.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;
import com.example.segurityshoppingcart.Segurity.Entity.Person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "book")
public class Book extends ABaseEntity{
	@Column(name= "title")private String title;
	
	@Column(name = "code")private String code;
	
	@Column(name= "amount")private int amount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name  = "autor_id")
	private Person autor;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public Person getAutor() {
		return autor;
	}

	public void setAutor(Person autor) {
		this.autor = autor;
	}
	
	

}
