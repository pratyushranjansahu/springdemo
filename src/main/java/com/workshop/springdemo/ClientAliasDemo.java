package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AliasDemoBean;
import com.workshop.springdemo.beans.Car;

public class ClientAliasDemo {

	public static void main(String[] args) {
		String[] files=new String[]{"aliasdemo.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		AliasDemoBean aliasDemoBean=(AliasDemoBean)applicationContext.getBean("alias_demo");
		//car.printDetails();
		System.out.println("Name "+aliasDemoBean.getName()+" Time :"+aliasDemoBean.getTime());
	}

}
