package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Car;
import com.workshop.springdemo.beans.CarCollection;

public class ClientSetterCollectionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsettercollectiontypedi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
				
				CarCollection cars=(CarCollection)applicationContext.getBean("car");
				cars.printData();
		}		

}
