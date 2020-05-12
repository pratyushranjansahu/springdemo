package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AbstractCustomer;
import com.workshop.springdemo.beans.CarSetterAuttowiredAnnotation;

public class ClientCarSetterAutowiredAnnotation {

	public static void main(String[] args) {
		String[] files=new String[]{"carsetterautowireannotation.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		CarSetterAuttowiredAnnotation carSetterAuttowiredAnnotation=(CarSetterAuttowiredAnnotation)applicationContext.getBean("car");
		System.out.println(carSetterAuttowiredAnnotation.getEngine());
	}

}
