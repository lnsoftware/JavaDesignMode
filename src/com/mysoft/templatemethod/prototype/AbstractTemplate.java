package com.mysoft.templatemethod.prototype;

/**
 * ============================================================================
 * 描述：模板方法设计模式
 * 	 1. 抽象模板角色
 * 		* 定义了一个或多个抽象操作，以便让子类实现，这些抽象操作较基本操作，它是一个顶级
 * 		    逻辑的组成步骤。
 * 		* 定义并实现了一个模板方法，这个模板方法一般是一个具体方法，给出了一个顶级骨架，逻辑的
 * 		    组成步骤在相应的抽象操作中，推迟到子类实现，顶级逻辑也可能调用一些具体方法
 *
 *   2. 具体模板角色
 * 		* 实现了父类定义的一个或多个抽象方法，他们是一个顶级逻辑的组成步骤
 * 		* 每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每个抽象模板都可以给出这些抽象
 * 		    方法的不同实现，从而是顶级逻辑的实现各不相同 
 * ------------------------------------------
 * @author lnsoftware
 * ------------------------------------------
 * @date 2015年11月13日
 * ============================================================================
 */
public abstract class AbstractTemplate {
	
	/**
	 * 模板方法
	 */
	public void templateMethod(){
		System.out.println("模板方法->开始");
		abstractMethod();
		hookMethod();
		concreteMethod();
		System.out.println("模板方法->结束");
	}
	
	/**
	 * 基本方法(由子类实现)
	 */
	protected abstract void abstractMethod();
	
	/**
	 * 基本方法(子类可以扩展)
	 */
	protected void hookMethod(){
		System.out.println("父类的hookMethod");
	}
	
	/**
	 * 基本方法(已实现)
	 */
	private final void concreteMethod(){
		// 具体的业务逻辑，子类无法扩展
		System.out.println("父类具体的业务逻辑");
	}
}
