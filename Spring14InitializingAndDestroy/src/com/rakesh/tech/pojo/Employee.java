package com.rakesh.tech.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	
	public void afterPropertiesSet()
	{
		System.out.println("Initialization is done here...........");
	}
	
	public void destroy()
	{
		System.out.println("Employee Object is destroyed...........");
	}
}
