package project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	
	public static void main(String[] args)
	{
		
		System.out.println(".....");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(".****.");
		Account account =(Account)context.getBean("acc");
		System.out.println("Salary : "+account.getSalary());
	    Employee e =(Employee)context.getBean("empone");
		System.out.println("Employee Salary : "+e.getAccount().getSalary());

	}
}
