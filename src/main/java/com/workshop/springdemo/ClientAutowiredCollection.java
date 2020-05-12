package com.workshop.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.workshop.springdemo.beans.AutowiredCollectionBean;
import com.workshop.springdemo.config.CollectionConfig;

public class ClientAutowiredCollection {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
		AutowiredCollectionBean collectionsBean = context.getBean(
				AutowiredCollectionBean.class);
		collectionsBean.printNameList();
	}

}
