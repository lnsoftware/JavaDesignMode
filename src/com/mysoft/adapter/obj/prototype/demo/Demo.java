package com.mysoft.adapter.obj.prototype.demo;

import com.mysoft.adapter.obj.prototype.Adaptee;
import com.mysoft.adapter.obj.prototype.Adapter;

public class Demo {

	public static void main(String[] args) {
		// 传入一个源角色的对象实例
		Adapter adapter = new Adapter(new Adaptee());
		adapter.method1();
		adapter.method2();
	}
	
}
