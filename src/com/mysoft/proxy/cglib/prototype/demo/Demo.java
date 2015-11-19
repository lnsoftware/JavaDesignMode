package com.mysoft.proxy.cglib.prototype.demo;

import com.mysoft.proxy.cglib.prototype.CglibImpl;
import com.mysoft.proxy.cglib.prototype.CglibProxy;

public class Demo {

	public static void main(String[] args) {
		
		CglibProxy proxy = new CglibProxy();
		
		CglibImpl proxyObj = (CglibImpl) proxy.getInstance(new CglibImpl());
		
		proxyObj.sayHello();
	}
	
}
