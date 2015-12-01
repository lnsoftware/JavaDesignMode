package com.mysoft.adapter.prototype;

/**
 * 类适配器-适配器角色
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void method2() {
		System.out.println("适配器角色方法二");
	}

}
