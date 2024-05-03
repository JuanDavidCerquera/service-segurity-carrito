package com.example.segurityshoppingcart.Operational.Bookshop.Entity;

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
@Table(name="library")
public class Library extends ABaseEntity{
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "book_id", nullable = false)
    private Book book;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "employed_id", nullable = false)
    private Employed employed;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "client_id", nullable = false)
    private Client client;

	
	@Column(name="amount", nullable = true)
	private int amount;
	
	@Column(name="action", nullable = true)
	private Boolean action;
	
	@Column(name="date", nullable = true)
	private LocalDateTime date;
}
