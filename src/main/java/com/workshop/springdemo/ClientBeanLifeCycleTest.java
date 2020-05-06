package com.workshop.springdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BeanLifeCycleDemoBean;

public class ClientBeanLifeCycleTest {

	public static void main(String[] args) {
		String[] files=new String[]{"beanlifecycle.xml"};
		ConfigurableApplicationContext   context=new ClassPathXmlApplicationContext(files);
		BeanLifeCycleDemoBean car=(BeanLifeCycleDemoBean)context.getBean("b1");
		//context.close();
		context.registerShutdownHook();
	}

}
