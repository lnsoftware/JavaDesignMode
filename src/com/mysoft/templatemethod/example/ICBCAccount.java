package com.mysoft.templatemethod.example;

public class ICBCAccount extends Account {

	@Override
	protected String getInterestType() {
		return "工商银行";
	}

	@Override
	protected double getInterestRate() {
		return 1.11;
	}

}
