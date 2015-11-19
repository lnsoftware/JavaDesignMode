package com.mysoft.proxy.jdk.prototype.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.mysoft.proxy.jdk.prototype.ProxyHandler;
import com.mysoft.proxy.jdk.prototype.ProxyImpl;
import com.mysoft.proxy.jdk.prototype.ProxyInterface;

/**
 * 只有类实现接口的方式才可以使用jdk的动态代理
 */
public class Demo {

	public static void main(String[] args) {
		
		ProxyInterface pi = new ProxyImpl();
		
		InvocationHandler handler = new ProxyHandler(pi);
		
		// 生成代理对象
		ProxyInterface proxyObj = (ProxyInterface) Proxy.newProxyInstance(pi.getClass().getClassLoader(), pi.getClass().getInterfaces(), handler);
		
		// 代理对象去执行真正的方法
		proxyObj.sayHello();
	}
}
