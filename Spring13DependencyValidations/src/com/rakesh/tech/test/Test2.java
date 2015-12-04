package com.rakesh.tech.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.tech.pojo.Account;
import com.rakesh.tech.pojo.Employee;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------1-----------------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-------------------1-------------------");
		Account account = (Account)context.getBean("acc");
		
		System.out.println("Salary : "+account.getSalary());
		
		Employee e = (Employee)context.getBean("empOne");
		
		System.out.println("Employee Salary : "+e.getAccount().getSalary());
		
		
	}

}
