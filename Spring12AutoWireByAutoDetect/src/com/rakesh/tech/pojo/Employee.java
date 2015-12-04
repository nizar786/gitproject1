package com.rakesh.tech.pojo;

public class Employee {

	private Account account;	

	public Employee(Account account)
	{
		System.out.println("Account Object created based on cons.................");
		this.account=account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		System.out.println("Account Object created based on setter injection............");
		this.account = account;
	}

		}
