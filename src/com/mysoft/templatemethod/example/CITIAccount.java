package com.mysoft.templatemethod.example;

public class CITIAccount extends Account {

	@Override
	protected String getInterestType() {
		return "花旗银行";
	}

	@Override
	protected double getInterestRate() {
		return 2.22;
	}

}
