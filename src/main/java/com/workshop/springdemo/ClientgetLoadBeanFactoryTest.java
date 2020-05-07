package com.workshop.springdemo;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.SetterDiTest;

public class ClientgetLoadBeanFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("setterdidemo.xml");
		SetterDiTest setterDiTest=(SetterDiTest)applicationContext.getBean("setterdiTest");
		ConfigurableListableBeanFactory configurableListableBeanFactory=applicationContext.getBeanFactory();
		System.out.println("Using getBeanFactory :"+configurableListableBeanFactory.getBeanDefinition("setterdiTest"));
		
	}

}
