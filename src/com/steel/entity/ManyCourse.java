package com.steel.entity;

import java.util.Set;

public class ManyCourse {

	private String cid;
	private String cname;
	
	private Set<ManyStudent> manyStudent;
	
	public ManyCourse() {
		
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<ManyStudent> getManyStudent() {
		return manyStudent;
	}

	public void setManyStudent(Set<ManyStudent> manyStudent) {
		this.manyStudent = manyStudent;
	}
}
