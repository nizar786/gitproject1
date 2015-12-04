package com.test.assignment;

import java.io.Serializable;

public class Record implements Serializable {
	
	private String firstName;
	private String lastName;
	private String type;
	private String address;
	private String state;
	private Integer visit;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getVisit() {
		return visit;
	}

	public void setVisit(Integer visit) {
		this.visit = visit;
	}

	@Override
	public String toString() {
		return "Record [firstName=" + firstName + ", lastName=" + lastName
				+ ", type=" + type + ", address=" + address + ", state="
				+ state + ", visit=" + visit + "]";
	}
}
