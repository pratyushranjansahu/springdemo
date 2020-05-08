package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Child;

public class ClientBeanTemplateTest {

	public static void main(String[] args) {
		String[] files=new String[]{"beantemplate.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Child child=(Child)applicationContext.getBean("child");
		System.out.println(child.getName()+" "+child.getAge());

	}

}
