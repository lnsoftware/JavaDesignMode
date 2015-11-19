package com.mysoft.proxy.cglib.prototype;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	private Object originalObj;
	
	/**
	 * 创建代理对象
	 */
	public Object getInstance(Object originalObj){
		this.originalObj = originalObj;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.originalObj.getClass());
		// 回调方法
		enhancer.setCallback(this);
		// 创建代理对象
		Object proxyObj = enhancer.create();
		return proxyObj;
	}
	
	/**
	 * 回调方法
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		
		doBefore();
		
		arg3.invokeSuper(arg0, arg2);
		
		doAfter();
		
		return null;
	}

	private void doAfter() {
		System.out.println("do after");
	}

	private void doBefore() {
		System.out.println("do before");
	}

}
