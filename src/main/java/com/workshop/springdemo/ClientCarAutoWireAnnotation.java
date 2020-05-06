package com.workshop.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Car;
import com.workshop.springdemo.beans.CarAutoWireAnnotation;

public class ClientCarAutoWireAnnotation {

	public static void main(String[] args) {
		
		String[] files=new String[]{"carsautowireannotation.xml","engineautowire.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		CarAutoWireAnnotation car=(CarAutoWireAnnotation)applicationContext.getBean("car");
		car.printDetails();
	}

}
