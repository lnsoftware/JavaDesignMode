package com.mysoft.facade.prototype;

/**
 * 外观模式
 */
public class Facade {

	// 提供统一的接口
	public void method(){
		ModuleA ma = new ModuleA();
		ma.methodA();
		
		ModuleB mb = new ModuleB();
		mb.methodB();
		
		ModuleC mc = new ModuleC();
		mc.methodC();
	}
	
}
