package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.TestOrderedBean;

public class ClientOrderedInterface {

	public static void main(String[] args) {
		String[] files=new String[]{"orderinterface.xml"};
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		

		TestOrderedBean bean = applicationContext.getBean(TestOrderedBean.class);
	        System.out.println("Ordered Interface implementation : "+bean.getRefBeanServices().getOrder());
	}

}
