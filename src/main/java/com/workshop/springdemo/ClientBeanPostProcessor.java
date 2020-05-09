package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AbstractCustomer;

public class ClientBeanPostProcessor {

	public static void main(String[] args) {
		String[] files=new String[]{"beanpostprocessor.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		
	}

}
