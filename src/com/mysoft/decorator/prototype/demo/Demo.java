package com.mysoft.decorator.prototype.demo;

import com.mysoft.decorator.prototype.Bird;
import com.mysoft.decorator.prototype.Fish;
import com.mysoft.decorator.prototype.Monkey;
import com.mysoft.decorator.prototype.TheGreatestSage;

public class Demo {

	public static void main(String[] args) {
		
		TheGreatestSage tgs = new Monkey();
		
		TheGreatestSage bird = new Bird(tgs);
		
		TheGreatestSage fish = new Fish(bird);
		
		fish.move();
		
	}
	
}
