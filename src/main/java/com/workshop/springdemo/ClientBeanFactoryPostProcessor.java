package com.workshop.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springdemo.beans.BeanFactoryPostProcessorbean;
import com.workshop.springdemo.config.BeanFactoryPostProcessorConfig;

public class ClientBeanFactoryPostProcessor {

	public static void main(String[] args) {
		//String[] files=new String[]{"abstractbean.xml"};
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		BeanFactoryPostProcessorbean bean = context.getBean(BeanFactoryPostProcessorbean.class);
		bean.doSomething();
	}

}
