package com.test.assignment;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class Record implements Serializable {
	
	private String firstName;
	private String lastName;
	private String type;
	private String address;
	private String state;
	private Integer visits;

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

	
	public Integer getVisits() {
		return visits;
	}

	public void setVisits(Integer visits) {
		this.visits = visits;
	}

	public String key() {
		return this.firstName + this.lastName;
	}
	
	 @Override
	public String toString() {
		return "Record [firstName=" + firstName + ", lastName=" + lastName
				+ ", type=" + type + ", address=" + address + ", state="
				+ state + ", visit=" + this.visits + "]";
	}

	public void merge(Record record) {
	       if(record !=null){
	    	   if(StringUtils.isBlank(this.firstName))
	    		   this.firstName = StringUtils.isNotBlank(record.getFirstName()) ? record.getFirstName() : this.firstName;
	    	   if(StringUtils.isBlank(this.lastName))
	    		   this.lastName = StringUtils.isNotBlank(record.getLastName()) ? record.getLastName() : this.lastName;
	    	   if(StringUtils.isBlank(this.type))
	    		   this.type = StringUtils.isNotBlank(record.getType()) ? record.getType() : this.type;
	    	   if(StringUtils.isBlank(this.address))
	    		   this.address = StringUtils.isNotBlank(record.getAddress()) ? record.getAddress() : this.address;
	    	   if(StringUtils.isBlank(this.state))
	    		   this.state = StringUtils.isNotBlank(record.getState()) ? record.getState() : this.state;
	    	   if(this.visits  == null)
	    		   this.visits = record.getVisits() != null ? record.getVisits() : this.visits;
	       }
	 }
	 
	 public boolean  havingNotNULLProperties() {
	       return StringUtils.isNotBlank(this.firstName)  && StringUtils.isNotBlank(this.lastName) && StringUtils.isNotBlank(this.type) && StringUtils.isNotBlank(this.address) && StringUtils.isNotBlank(this.state) && this.visits != null;
	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
}
