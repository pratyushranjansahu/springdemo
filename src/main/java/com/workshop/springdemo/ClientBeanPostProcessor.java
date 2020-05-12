package com.workshop.springdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientBeanPostProcessor {

	public static void main(String[] args) {
		String[] files=new String[]{"beanpostprocessor.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		
	}

}
