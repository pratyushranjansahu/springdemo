package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.SetterDiTest;

public class ClientSetterPNmaeSpaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("setterpnamedidemo.xml");
		SetterDiTest setterDiTest=(SetterDiTest)applicationContext.getBean("setterdiTest");
		
		setterDiTest.hello("Pratyush");
	}

}
