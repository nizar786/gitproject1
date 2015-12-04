package project1;

public class Employee {

	
	Account account;
	
	public Employee()
	{
		System.out.println("Empoyee object created..");
		
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
