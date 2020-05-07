package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.SetterDiTest;

public class ClientReferenceTagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files=new String[]{"carsereferencetag.xml","enginesecondarytypedi.xml"};
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		System.out.println("Using reference bean Tag");		
				
	}

}
