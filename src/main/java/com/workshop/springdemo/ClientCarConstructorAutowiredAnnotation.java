package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.CarConstructorAuttowiredAnnotation;
import com.workshop.springdemo.beans.CarSetterAuttowiredAnnotation;

public class ClientCarConstructorAutowiredAnnotation {

	public static void main(String[] args) {
		String[] files=new String[]{"carconstructorautowireannotation.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		CarConstructorAuttowiredAnnotation carSetterAuttowiredAnnotation=(CarConstructorAuttowiredAnnotation)applicationContext.getBean("car");
		System.out.println(carSetterAuttowiredAnnotation.getEngine());
	}

}
