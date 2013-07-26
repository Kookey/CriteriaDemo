package com.steel.entity;

import java.util.Set;

public class Student {

	private String sId;
	private String sName;
	private String sAge;
	private Set book;
	
	public Student() {
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAge() {
		return sAge;
	}
	public void setsAge(String sAge) {
		this.sAge = sAge;
	}
	public Set getBook() {
		return book;
	}
	public void setBook(Set book) {
		this.book = book;
	}
	
}
