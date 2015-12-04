package com.rakesh.tech.pojo;

public class Employee {

	private Account account;

	public Employee()
	{
		System.out.println("Employee Object created..........");
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	}
