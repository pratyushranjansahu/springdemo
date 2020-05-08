package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.Holiday;
import com.workshop.springdemo.beans.Workday;

public class ClientDefaultLazyInitializationContainerLevelTest {

	public static void main(String[] args) {
		String[] files=new String[]{"containerlevellazyinitialization.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		System.out.println("Application context loaded");
        Holiday holiday = applicationContext.getBean(Holiday.class);
        Workday workday = applicationContext.getBean(Workday.class);
	}

}
