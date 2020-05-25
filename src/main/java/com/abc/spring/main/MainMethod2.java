package com.abc.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.spring.pojo.Person;

public class MainMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext  apc =  new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Person pe = (Person) apc.getBean("p2");
		
		System.out.println(pe.toString());
		
	}

}
