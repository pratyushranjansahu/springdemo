package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AliasDemoBean;
import com.workshop.springdemo.beans.Person;

public class ClientPrimaryAttributeTest {

	public static void main(String[] args) {
		String[] files=new String[]{"primaryattribute.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Person person=(Person)applicationContext.getBean(Person.class);
		System.out.println(person);
	}

}
