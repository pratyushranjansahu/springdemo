package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AliasDemoBean;
import com.workshop.springdemo.beans.Car;
import com.workshop.springdemo.beans.Country;

public class ClientJavaBasedConfiguration {

	public static void main(String[] args) {
		String[] files=new String[]{"javabasedconfig.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Country country=(Country)applicationContext.getBean("countryObj");
		System.out.println(country.getCountryName());
		
	}

}
