package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.compound.Bar;

public class ClientCompondPropertyTest {

	public static void main(String[] args) {
		String[] files=new String[]{"compoundpropdemo.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		Bar bar=(Bar)applicationContext.getBean("compoundPropertyName");
		System.out.println(bar.getFoo().getFred().getBob().getJhon());
	}

}
