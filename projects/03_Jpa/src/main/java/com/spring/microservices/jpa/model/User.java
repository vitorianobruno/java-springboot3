package com.spring.microservices.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class User implements Serializable{

	@Id
	private long id;
	
	private String name;

	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
