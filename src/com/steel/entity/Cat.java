package com.steel.entity;

public class Cat {

	private int id;
	private String name;
	private String color;
	private String size;
	private Integer age;
	public Cat() {
	}
	
	public Cat(String name,String color,String size,Integer age){
		this.name = name;
		this.color = color;
		this.size = size;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
