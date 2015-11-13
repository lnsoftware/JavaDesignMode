package com.mysoft.templatemethod.prototype;

public class ConcreteTemplate1 extends AbstractTemplate {

	@Override
	protected void abstractMethod() {
		System.out.println("子类01实现的abstractMethod()方法");
	}
	
	@Override
	protected void hookMethod() {
		// 扩展父类的实现
		System.out.println("子类01扩展的hookMethod()方法");
	}

}
