package com.steel.entity;

import java.io.Serializable;

public class Dormitory implements Serializable{

	private int dId;
	private String address;
	
	public Dormitory() {
	}
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
