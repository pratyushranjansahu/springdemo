package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Car;
import com.workshop.springdemo.beans.CarCollection;
import com.workshop.springdemo.beans.CarSetterMandatory;

public class ClientSetterMandatory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsettermandatorydi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
				
				CarSetterMandatory cars=(CarSetterMandatory)applicationContext.getBean("car");
				cars.printData();
		}		

}
