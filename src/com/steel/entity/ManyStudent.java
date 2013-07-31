package com.steel.entity;

import java.util.Set;

public class ManyStudent {

	private String sid;
	private String sname;
	private String sage;
	
	private Set<ManyCourse> manyCourse;
	
	public ManyStudent() {
		
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSage() {
		return sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

	public Set<ManyCourse> getManyCourse() {
		return manyCourse;
	}

	public void setManyCourse(Set<ManyCourse> manyCourse) {
		this.manyCourse = manyCourse;
	}
}
