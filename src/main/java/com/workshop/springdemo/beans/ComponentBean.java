package com.workshop.springdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {
	public int add(int x, int y) {
		return x + y;
	}
}
