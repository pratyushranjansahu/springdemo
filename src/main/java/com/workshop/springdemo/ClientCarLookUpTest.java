package com.workshop.springdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.CarLookUp;

public class ClientCarLookUpTest {

	public static void main(String[] args) {
		
		String[] files=new String[]{"carlookupmethod.xml"};
		ConfigurableApplicationContext   context=new ClassPathXmlApplicationContext(files);
		CarLookUp carLookUp=(CarLookUp)context.getBean("car");
		System.out.println("Implementation class name is : "+carLookUp.getClass().getName() );
		System.out.println("My Engine Details using Lookup Method");
		
		System.out.println(carLookUp.myEngine());
		//context.close();
		//context.registerShutdownHook();
	}

}
