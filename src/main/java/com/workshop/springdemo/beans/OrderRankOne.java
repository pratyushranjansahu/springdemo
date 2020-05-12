package com.workshop.springdemo.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class OrderRankOne implements OrderRanks{
private String rank = "RankOne";
	
	public String toString(){
		return this.rank;
	}
}
