package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.ConstructorDiTest;

public class ClientConstructorCNameSpaceTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("constructorcnamedidemo.xml");
		ConstructorDiTest constructorDiTest=(ConstructorDiTest)applicationContext.getBean("consturctorditest");
		constructorDiTest.hello();
		
	}

}
