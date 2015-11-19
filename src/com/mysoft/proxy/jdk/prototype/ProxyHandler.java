package com.mysoft.proxy.jdk.prototype;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

	// 要代理的原始对象
	private Object originalObj;
	
	public ProxyHandler(Object originalObj) {
		this.originalObj = originalObj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		
		// 执行前校验
		doBefore();
		
		result = method.invoke(originalObj, args);
		
		// 执行后校验
		doAfter();
		
		return result;
	}

	/**
	 * 执行前的检查
	 */
	private void doBefore(){
		System.out.println("do before");
	}
	
	/**
	 * 执行后的检查
	 */
	private void doAfter(){
		System.out.println("do after");
	}
}
