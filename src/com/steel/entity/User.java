package com.steel.entity;

import java.io.Serializable;

public class User implements Serializable{

	private int uId;
	private String name;
	private Dormitory dorm;
	
	public User() {
	}
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dormitory getDorm() {
		return dorm;
	}
	public void setDorm(Dormitory dorm) {
		this.dorm = dorm;
	}
	
}
