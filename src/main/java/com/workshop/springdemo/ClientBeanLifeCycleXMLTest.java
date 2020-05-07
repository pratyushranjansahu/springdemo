package com.workshop.springdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BeanLifeCycleXMLDemoBean;

public class ClientBeanLifeCycleXMLTest {

	public static void main(String[] args) {
		
		String[] files=new String[]{"beanlifecyclexml.xml"};
		ConfigurableApplicationContext   context=new ClassPathXmlApplicationContext(files);
		BeanLifeCycleXMLDemoBean car=(BeanLifeCycleXMLDemoBean)context.getBean("b1");
		//context.close();
		context.registerShutdownHook();
	}

}
