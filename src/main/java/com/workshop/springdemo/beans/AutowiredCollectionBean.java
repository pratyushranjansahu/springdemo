package com.workshop.springdemo.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredCollectionBean {
	@Autowired
    private List<String> nameList;
 
    public void printNameList() {
        System.out.println(nameList);
    }
}
