package com.mysoft.adapter.prototype.demo;

import com.mysoft.adapter.prototype.Adapter;
import com.mysoft.adapter.prototype.Target;

/**
 * 这样适配器Adapter同时具有method1()和method2()两个方法
 */
public class Demo {

	public static void main(String[] args) {
		
		Target target = new Adapter();
		target.method1();
		target.method2();
	}
	
}
