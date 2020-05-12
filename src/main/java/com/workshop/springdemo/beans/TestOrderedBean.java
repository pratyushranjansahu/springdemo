package com.workshop.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TestOrderedBean {
	@Autowired
	private RefBeanService refBeanServices;

	public RefBeanService getRefBeanServices() {
		return refBeanServices;
	}

	public void setRefBeanServices(RefBeanService refBeanServices) {
		this.refBeanServices = refBeanServices;
	}

	@Override
	public String toString() {
		return "TestOrderedBean [refBeanServices=" + refBeanServices + "]";
	}
	
	
}

