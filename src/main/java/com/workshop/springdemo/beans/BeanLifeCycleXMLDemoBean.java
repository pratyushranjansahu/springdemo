package com.workshop.springdemo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleXMLDemoBean {
 
    private String name;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	BeanLifeCycleXMLDemoBean() {
        System.out.println("Constructor of BeanLife Cycle XML ");
    }
	
	public void myInit() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init  Method Using XML Approach ");
	}

	
	public void myDestroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method Using XML");
	}
}
