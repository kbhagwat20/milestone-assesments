package com.mindtree.vehicleservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	
	@Column(name="registration_number")
	private String registrationNumber;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private String state;
	
	@Column
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Vehicle(int id, String registrationNumber, String name, String type, String state, String city) {
		super();
		this.id = id;
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.type = type;
		this.state = state;
		this.city = city;
	}

	public Vehicle() {
		super();
	}
	
	

}
