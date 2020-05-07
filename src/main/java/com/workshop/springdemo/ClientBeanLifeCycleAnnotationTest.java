package com.workshop.springdemo;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BeanLifeCycleAnnotationDemoBean;

public class ClientBeanLifeCycleAnnotationTest {

	public static void main(String[] args) {
		
		String[] files=new String[]{"beanlifecycleannotation.xml"};
		ConfigurableApplicationContext   context=new ClassPathXmlApplicationContext(files);
		BeanLifeCycleAnnotationDemoBean car=(BeanLifeCycleAnnotationDemoBean)context.getBean("b1");
		//context.close();
		context.registerShutdownHook();
	}

}
