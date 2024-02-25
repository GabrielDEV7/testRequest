package com.apiTest.apiTest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	
	private Integer id;
	
	@Column(name = "firstname", length = 200, nullable = true)
	private String firstname;
	

	@Column(name = "lastname", length = 200, nullable = true)
	private String lastname;
	
	@Column(name = "contact", length = 20, nullable = true)
	private String contact;
	
	@Column(name = "cep", length = 20, nullable = true)
	private String cep;
	
	@Column(name = "city", length = 200, nullable = true)
	private String city;
	
	@Column(name = "state", length = 200, nullable = true)
	private String state;

	@Column(name = "email", length = 200, nullable = true)
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
