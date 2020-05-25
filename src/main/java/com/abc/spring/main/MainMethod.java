package com.abc.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.spring.pojo.Person;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Person p = (Person) ctx.getBean("p1");
		System.out.println(p.toString());
	}

}
