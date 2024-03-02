package com.test;

public class Student {
	
	String name;
	String id;
	String gmail;
	String address;



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", id='" + id + '\'' +
				", gmail='" + gmail + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
