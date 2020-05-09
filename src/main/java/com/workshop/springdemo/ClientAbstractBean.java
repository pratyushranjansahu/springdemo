package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AbstractCustomer;

public class ClientAbstractBean {

	public static void main(String[] args) {
		String[] files=new String[]{"abstractbean.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		AbstractCustomer cust = (AbstractCustomer)applicationContext.getBean("childCustomer");
		System.out.println(cust);
	}

}
