package com.spring.microservices.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@JsonProperty("Id")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private long id;

	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;

	@JsonProperty("address")
	private String address;

	@Column(name = "CITY")
	@JsonProperty("city")
	private String city;

	@Column(name = "COUNTRY")
	@JsonProperty("country")
	private String country;

	public User(){}

	public User(long id, String name, String address, String city, String country) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				'}';
	}
}
