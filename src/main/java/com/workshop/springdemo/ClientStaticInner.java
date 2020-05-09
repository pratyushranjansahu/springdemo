package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.OuterBean;

public class ClientStaticInner {

	public static void main(String[] args) {
		String[] files = new String[] { "staticinner.xml" };

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);

		OuterBean.Inner inner = (OuterBean.Inner) applicationContext.getBean("iBean");
		inner.msg();

	}

}
