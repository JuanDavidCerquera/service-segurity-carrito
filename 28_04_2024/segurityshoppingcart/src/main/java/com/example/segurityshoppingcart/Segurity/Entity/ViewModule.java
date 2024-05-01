package com.example.segurityshoppingcart.Segurity.Entity;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "viewmodule")
public class ViewModule extends ABaseEntity{
        @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "View_id" )
    private View view;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "module_id" )
    private Modules modules;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }
    
}
