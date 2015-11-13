package com.mysoft.templatemethod.prototype.demo;

import com.mysoft.templatemethod.prototype.AbstractTemplate;
import com.mysoft.templatemethod.prototype.ConcreteTemplate1;
import com.mysoft.templatemethod.prototype.ConcreteTemplate2;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		AbstractTemplate at1 = new ConcreteTemplate1();
		at1.templateMethod();
		
		AbstractTemplate at2 = new ConcreteTemplate2();
		at2.templateMethod();
	}

}
