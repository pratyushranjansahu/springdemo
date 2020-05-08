package com.workshop.springdemo;

import java.util.Calendar;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BeanLifeCycleAnnotationDemoBean;
import com.workshop.springdemo.beans.CarInstance;
import com.workshop.springdemo.beans.StaticFactoryTestBean;

public class ClientInstanceFactoryTest {

	public static void main(String[] args) {
		
		String[] files=new String[]{"instancefactorytest.xml"};
		ApplicationContext   context=new ClassPathXmlApplicationContext(files);
		CarInstance carInstance=(CarInstance)context.getBean("c");
		carInstance.drive();
	}

}
