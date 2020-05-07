package com.workshop.springdemo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.workshop.springdemo.beans.SetterDiTest;

public class ClientGenericApplicationContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("setterdidemo.xml");
		context.refresh();
		
		
		SetterDiTest setterDiTest=(SetterDiTest)context.getBean("setterdiTest");
		System.out.println("Using GenericApplicationContext");
		setterDiTest.hello("Hari");
		
		
	}

}
