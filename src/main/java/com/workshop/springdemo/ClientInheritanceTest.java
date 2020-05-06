package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Child;

public class ClientInheritanceTest {

	public static void main(String[] args) {
		String[] files=new String[]{"beaninheritance.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Child child=(Child)applicationContext.getBean("child");
		System.out.println(child.getName()+" "+child.getAge());

	}

}
