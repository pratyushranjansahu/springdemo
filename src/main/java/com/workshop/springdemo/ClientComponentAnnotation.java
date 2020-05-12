package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AbstractCustomer;
import com.workshop.springdemo.beans.ComponentBean;

public class ClientComponentAnnotation {

	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.workshop.springdemo.beans");
		context.refresh();

		ComponentBean componentBean = context.getBean(ComponentBean.class);

		int result = componentBean.add(1, 2);
		System.out.println("Addition of 1 and 2 = " + result);

		context.close();
	}

}
