package com.example.segurityshoppingcart.Operational.Store.Entity;

import java.time.LocalDateTime;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;
import com.example.segurityshoppingcart.Operational.Entity.Client;
import com.example.segurityshoppingcart.Operational.Entity.Employed;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bill")
public class Bill extends ABaseEntity{

	@Column(name="date")private LocalDateTime date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name = "employed_id")
	private Employed employed;

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employed getEmployed() {
		return employed;
	}

	public void setEmployed(Employed employed) {
		this.employed = employed;
	}
	
	
}
