package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AliasDemoBean;
import com.workshop.springdemo.beans.Car;
import com.workshop.springdemo.entity.EmployeeFactoryDTO;

public class ClientAbstractFactory {

	public static void main(String[] args) {
		String[] files=new String[]{"abstractfactorybean.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		 EmployeeFactoryDTO manager = (EmployeeFactoryDTO) applicationContext.getBean("manager");
	        System.out.println(manager);
	         
	        EmployeeFactoryDTO director = (EmployeeFactoryDTO) applicationContext.getBean("director");
	        System.out.println(director);
	}

}
