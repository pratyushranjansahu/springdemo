package com.workshop.springdemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workshop.springdemo.beans.BeanLifeCycleDemoBean;
import com.workshop.springdemo.beans.CollectionMergingBean;

public class ClientCollectionMerging {

	public static void main(String[] args) {
		String[] files=new String[]{"collectionmerging.xml"};
		ConfigurableApplicationContext   context=new ClassPathXmlApplicationContext(files);
		CollectionMergingBean collectionMerging=(CollectionMergingBean)context.getBean("bean2");
		System.out.println(collectionMerging);
	}

}
