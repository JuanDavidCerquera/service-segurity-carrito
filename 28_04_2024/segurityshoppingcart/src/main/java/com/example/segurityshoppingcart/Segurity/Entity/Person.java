package com.example.segurityshoppingcart.Segurity.Entity;

import java.time.LocalDate;

import com.example.segurityshoppingcart.Base.Entity.ABaseEntity;
import com.example.segurityshoppingcart.Parameter.Entity.Municipality;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends ABaseEntity{
    
    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;
    @Column(name = "email",nullable = false, unique = true)
    private String email;
    
    @Column(name = "phone", nullable = false)
    private String phone;
    
    @Column(name = "datebirth", nullable = false)
    private LocalDate dateBirth;
    
    @Column(name = "gender", nullable = false)
    private String gender;
    
    @Column(name = "address", nullable = false)
    private String address;
    
    @Column(name = "type_document", nullable = false)
    private String typeDocument;
    
    @Column(name = "document",nullable = false, unique=true)
    private String Document;

    @ManyToOne(fetch = FetchType.EAGER, optional = false )
    @JoinColumn(name = "municipality_id", nullable = false)
    private Municipality municipality;
    

    public Municipality getMunicipality() {
		return municipality;
	}

	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }

  
    
}
