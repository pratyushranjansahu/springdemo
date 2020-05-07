package com.workshop.springdemo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleAnnotationDemoBean {
 
    private String name;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	BeanLifeCycleAnnotationDemoBean() {
        System.out.println("Constructor of BeanLife Cycle Annotation ");
    }
	@PostConstruct
	public void myInit() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init  Method Using Annotation Approach ");
	}

	@PreDestroy
	public void myDestroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method Using Annotation");
	}
}
