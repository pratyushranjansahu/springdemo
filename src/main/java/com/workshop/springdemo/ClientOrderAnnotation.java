package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.OrderResults;

public class ClientOrderAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("orderannotation.xml");
		OrderResults results = (OrderResults)context.getBean("results");
		System.out.println(results);

	}

}
