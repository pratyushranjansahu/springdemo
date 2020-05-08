package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AliasDemoBean;
import com.workshop.springdemo.beans.Car;
import com.workshop.springdemo.beans.NullStringBean;
import com.workshop.springdemo.entity.EmployeeFactoryDTO;

public class ClientNullString {

	public static void main(String[] args) {
		String[] files = new String[] { "nullstring.xml" };
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
		NullStringBean nullStringBean = (NullStringBean) applicationContext.getBean("nullString");
		System.out.println(nullStringBean);

	}

}
