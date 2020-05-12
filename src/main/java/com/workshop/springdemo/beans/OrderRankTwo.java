package com.workshop.springdemo.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class OrderRankTwo implements OrderRanks {
private String rank = "RankTwo";
	
	public String toString(){
		return this.rank;
	}
}
