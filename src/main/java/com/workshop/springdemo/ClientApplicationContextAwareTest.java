package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.ApplicationContextAwareBean;

public class ClientApplicationContextAwareTest {

	public static void main(String[] args) {
		String[] files=new String[]{"applicationcontextaware.xml"};
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext(files);
		ApplicationContextAwareImpl appcontext= (ApplicationContextAwareImpl)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		ApplicationContextAwareBean a= (ApplicationContextAwareBean)appCon.getBean("testA");
		a.doTask();
		context.registerShutdownHook();
		
	}

}
