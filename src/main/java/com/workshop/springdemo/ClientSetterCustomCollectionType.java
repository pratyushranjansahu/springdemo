package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.CarCustomCollection;

public class ClientSetterCustomCollectionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsettercustomcollectiontypedi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
				System.out.println("Custom collection");
				
				CarCustomCollection cars=(CarCustomCollection)applicationContext.getBean("car");
				cars.printData();
		}		

}
