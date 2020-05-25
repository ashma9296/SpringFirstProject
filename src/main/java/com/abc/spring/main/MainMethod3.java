package com.abc.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.spring.pojo.Employee;
import com.abc.spring.pojo.Person;

public class MainMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee emp1 = (Employee) ctx.getBean("emp");
		System.out.println(emp1.toString());
	}

}
