package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.SetterDiTest;

public class ClientSecondarySetterInnerbeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsecondarytypeinnerbeandi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
				

	}

}
