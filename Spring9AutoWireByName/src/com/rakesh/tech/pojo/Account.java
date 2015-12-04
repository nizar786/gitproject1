package com.rakesh.tech.pojo;

public class Account {

	private int salary=10000;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Account()
	{
		System.out.println("Account object created........");
	}
}
