package com.workshop.springdemo;

import java.util.Calendar;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BeanLifeCycleAnnotationDemoBean;
import com.workshop.springdemo.beans.StaticFactoryTestBean;

public class ClientStaticFactoryTest {

	public static void main(String[] args) {
		
		String[] files=new String[]{"staticfactorytest.xml"};
		ApplicationContext   context=new ClassPathXmlApplicationContext(files);
		StaticFactoryTestBean staticTest=(StaticFactoryTestBean)context.getBean("test");
		StaticFactoryTestBean staticTest1=(StaticFactoryTestBean)context.getBean("test");
		Calendar calendar=(Calendar)context.getBean("calendar");
		System.out.println("Using Static Factory...");
		System.out.println("Object Comparision : "+(staticTest==staticTest1));
		System.out.println(calendar.getCalendarType());
	}

}
