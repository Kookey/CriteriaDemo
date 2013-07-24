package com.steel.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {

	private Integer id;
	private String name;
	private Address address;

	public Person() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
