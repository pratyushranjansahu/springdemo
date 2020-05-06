package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Car;

public class ClientCarAutoWire {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("carsautowire.xml");
		Car car=(Car)applicationContext.getBean("car");
		car.printDetails();
	}

}
