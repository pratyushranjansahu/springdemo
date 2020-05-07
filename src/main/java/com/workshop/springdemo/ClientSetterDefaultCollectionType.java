package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.CarDefaultCollection;

public class ClientSetterDefaultCollectionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsetterdefaultcollectiontypedi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
				System.out.println("Using default collection");
				CarDefaultCollection cars=(CarDefaultCollection)applicationContext.getBean("car");
				cars.printData();
		}		

}
