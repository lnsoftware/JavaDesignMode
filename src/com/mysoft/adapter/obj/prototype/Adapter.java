package com.mysoft.adapter.obj.prototype;

/**
 * 对象适配器 - 适配器角色
 */
public class Adapter implements Target {

	// 源角色的对象引用
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	@Override
	public void method1() {
		this.adaptee.method1();
	}

	@Override
	public void method2() {
		System.out.println("适配器角色方法二");
	}

}
