package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AbstractCustomer;

public class ClientSimpleThreadScope {

	public static void main(String[] args) {
		String[] files=new String[]{"simplethreadscope.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		context.getBean("simpleThreadScopeBean");
	}

}
