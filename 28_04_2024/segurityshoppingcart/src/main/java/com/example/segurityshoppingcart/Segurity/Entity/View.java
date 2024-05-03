package com.example.segurityshoppingcart.Segurity.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "view")
public class View extends ABaseEntity{
    	@Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "route", nullable = false, unique = true)
    private String route;
    
    @Column(name = "description")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
