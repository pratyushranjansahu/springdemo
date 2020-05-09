package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.AbstractCustomer;
import com.workshop.springdemo.beans.CircularBeanA;
import com.workshop.springdemo.beans.CircularBeanB;

/*
 * https://www.logicbig.com/tutorials/spring-framework/spring-core/circular-dependencies.html
 */
@ComponentScan(basePackageClasses = ClientCircularBean.class, useDefaultFilters = false,
//scan only the nested beans of this class
includeFilters = {@ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        value = {CircularBeanB.class, CircularBeanA.class})})
@Configuration
public class ClientCircularBean {

	public static void main(String[] args) {
		 ApplicationContext context =
	                new AnnotationConfigApplicationContext(ClientCircularBean.class);
	}

}
