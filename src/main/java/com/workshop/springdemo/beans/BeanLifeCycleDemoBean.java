package com.workshop.springdemo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements DisposableBean, InitializingBean {
 
    private String name;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	BeanLifeCycleDemoBean() {
        System.out.println("Constructor of BeanLifeCycleDemoBean ");
    }
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method ");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method ");
	}
}
