package com.tma.model;

public class User {

	private String id;
	private String address;
	private String name;
	private int age;
	
	public User(){
		
	}
	
	public User(String id, String address, String name, int age) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", address=" + address + ", name=" + name
				+ ", age=" + age + "]";
	}

	
}
