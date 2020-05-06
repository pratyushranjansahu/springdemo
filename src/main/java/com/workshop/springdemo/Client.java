package com.workshop.springdemo;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.workshop.springdemo.beans.PrivateTest;
import com.workshop.springdemo.beans.Test;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		Resource resource=new ClassPathResource("spring.xml");
	
		//File f=ResourceUtils.getFile("spring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Test t1=(Test)beanFactory.getBean("t");
		Test t2=(Test)beanFactory.getBean("t");
		
		System.out.println(t1==t2);//return false if scope is prototype;
		/*
		 * spring can make object of private constructor also by using Reflection api.
		 * Class.forName("PrivateTest")
		 * */
		PrivateTest privateTest=(PrivateTest)beanFactory.getBean("pt");
		
		
		
		
		

	}

}
