package com.mysoft.templatemethod.example;

/**
 * ==========================================
 * 描述：模板方法模式的具体应用
 * 		计算利息
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月13日
 * ==========================================
 */
public abstract class Account {

	public final double calculateInterest(){
		// 利息比例
		double interestRate = getInterestRate();
		// 利息类型
		String interestType = getInterestType();
		// 计算
		double value = calculate(interestRate, interestType);
		
		return value;
	}

	/**
	 * 子类实现，传入利息类型
	 */
	protected abstract String getInterestType();

	/**
	 * 子类实现，传入利息利率
	 */
	protected abstract double getInterestRate();
	
	/**
	 * 根据利息和利率计算
	 */
	private final double calculate(double interestRate, String interestType) {
		System.out.println("利息利率=" + interestRate + "利息类型=" + interestType);
		return 1.23d;
	}
}
