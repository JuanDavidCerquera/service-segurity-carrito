package com.example.segurityshoppingcart.Entity.Segurity;

import com.example.segurityshoppingcart.Entity.ABaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "roleview")
public class RoleView extends ABaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "View_id" )
    private View view;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id" )
    private Role role;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
