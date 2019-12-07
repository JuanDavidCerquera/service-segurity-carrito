package com.example.segurityshoppingcart.Segurity.DTO;

import com.example.segurityshoppingcart.Segurity.Entity.Person;

public class SaveUserPersonDto {

    private Person person;
    private String username;
    private String password;
    
    
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
