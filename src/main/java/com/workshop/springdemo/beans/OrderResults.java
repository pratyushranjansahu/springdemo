package com.workshop.springdemo.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderResults {
	@Autowired
	private List<OrderRanks> ranks ;
	
	public List getRanks() {
		return ranks;
	}

	public void setRanks(List ranks) {
		this.ranks = ranks;
	}

	@Override
	public String toString(){
		return ranks.toString();
	}
}
