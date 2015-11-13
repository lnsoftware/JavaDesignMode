package com.mysoft.templatemethod.prototype;

public class ConcreteTemplate2 extends AbstractTemplate {

	@Override
	protected void abstractMethod() {
		System.out.println("子类02实现的abstractMethod()抽象方法");
	}
	
	@Override
	protected void hookMethod() {
		System.out.println("子类02置换的hookMethod()抽象方法");
	}

}
