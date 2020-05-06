package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Test;

public class ClientTestApplicationContext {

	

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Test test=(Test)applicationContext.getBean("t");
		
		//System.out.println(test);
	}

}
