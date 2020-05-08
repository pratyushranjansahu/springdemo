package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springdemo.beans.Country;
import com.workshop.springdemo.config.IocApplicationConfiguration;

public class ClientJavaBasedConfiguration {

	public static void main(String[] args) {
		//String[] files=new String[]{"javabasedconfig.xml"};
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(IocApplicationConfiguration.class);
		Country country=(Country)applicationContext.getBean("countryObj");
		System.out.println(country.getCountryName());
		
	}

}
