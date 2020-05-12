package com.workshop.springdemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.workshop.springdemo.beans.CustomBeanPostProcessor;



public class ClientAddBenPostProcessorMethod {

	public static void main(String[] args) {
		String[] files=new String[]{"beanpostprocessor.xml"};
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext(files);
		ConfigurableBeanFactory  factory = new XmlBeanFactory(new FileSystemResource("D:\\NineLeapsProject\\springdemo\\springdemo\\src\\main\\resources\\beanpostprocessor.xml"));
		// now register some beans
		// now register any needed BeanPostProcessors
		CustomBeanPostProcessor postProcessor = new CustomBeanPostProcessor(); 
		factory.addBeanPostProcessor(postProcessor);
		
	}

}
