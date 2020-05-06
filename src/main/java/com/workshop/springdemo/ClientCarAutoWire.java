package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Car;

public class ClientCarAutoWire {

	public static void main(String[] args) {
		String[] files=new String[]{"carsautowire.xml","engineautowire.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Car car=(Car)applicationContext.getBean("car");
		car.printDetails();
	}

}
