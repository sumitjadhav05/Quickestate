package com.Properties.QuickEstate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	Long id;
	
	String name;
	
	Long contact;
	
//	@OneToOne
//	Address address;
	
	String email;
	
	String gender;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	List<Property> property;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	List<Advertisment> advertisment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}


//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}

	public List<Advertisment> getAdvertisment() {
		return advertisment;
	}

	public void setAdvertisment(List<Advertisment> advertisment) {
		this.advertisment = advertisment;
	}

		
}
