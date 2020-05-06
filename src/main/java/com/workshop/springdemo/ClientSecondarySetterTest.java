package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.SetterDiTest;

public class ClientSecondarySetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsecondarytypedi.xml","enginesecondarytypedi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
				

	}

}
