package com.rakesh.tech.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.tech.pojo.Employee;
import com.rakesh.tech.pojo.EmployeeOwnMethods;

public class TestApplicationContext {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------1-----------------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("-------------------1-------------------");
		Employee employee = (Employee)context.getBean("empOne");
		
		//EmployeeOwnMethods employee2 = (EmployeeOwnMethods)context.getBean("empOne");
		
	}

}
