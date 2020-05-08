package com.workshop.springdemo.beans;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import com.workshop.springdemo.entity.EmployeeFactoryDTO;

public class EmployeeFactoryBean extends AbstractFactoryBean<Object>{

	private String designation;
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public Class<EmployeeFactoryDTO> getObjectType() {
		// TODO Auto-generated method stub
		return EmployeeFactoryDTO.class;
	}

	@Override
	protected Object createInstance() throws Exception {
		EmployeeFactoryDTO employee = new EmployeeFactoryDTO();
	        employee.setId(-1);
	        employee.setFirstName("dummy");
	        employee.setLastName("dummy");
	        //Set designation here
	        employee.setDesignation(designation);
	        return employee;
		
	}

}
