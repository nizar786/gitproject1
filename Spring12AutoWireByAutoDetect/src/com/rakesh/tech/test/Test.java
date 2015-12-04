package com.rakesh.tech.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.tech.pojo.Employee;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee = (Employee)context.getBean("empOne");
		
		System.out.println(employee.getAccount().getSalary());
		
	}

}
