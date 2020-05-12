package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.SetterDiRequiredTest;

public class ClientSetterRequiredTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("setterdiusingrequired.xml");
		SetterDiRequiredTest setterDiTest=(SetterDiRequiredTest)applicationContext.getBean("setterdiTest");
		
		setterDiTest.hello("Pratyush");
	}
}
