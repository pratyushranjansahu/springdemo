package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Profile;

public class ClientAnnotationBasedConfiguration {

	public static void main(String[] args) {
		String[] files=new String[]{"annotationbasedconfig.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Profile profile = (Profile) applicationContext.getBean("profile");
        profile.printAge();
        profile.printName();
		
	}

}
