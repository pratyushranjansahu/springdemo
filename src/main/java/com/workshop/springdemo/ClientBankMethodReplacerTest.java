package com.workshop.springdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BankMethodReplacer;
import com.workshop.springdemo.beans.CarLookUp;

public class ClientBankMethodReplacerTest {

	public static void main(String[] args) {
		
		String[] files=new String[]{"bankmethodreplacer.xml"};
		ConfigurableApplicationContext   context=new ClassPathXmlApplicationContext(files);
		BankMethodReplacer bankMethodReplacer=(BankMethodReplacer)context.getBean("bank");
		bankMethodReplacer.calculateIntrest();
		
	}

}
