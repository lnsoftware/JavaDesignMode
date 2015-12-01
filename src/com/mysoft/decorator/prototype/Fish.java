package com.mysoft.decorator.prototype;

public class Fish extends Decorator {

	private TheGreatestSage tgs;
	
	public Fish(TheGreatestSage tgs) {
		super(tgs);
		this.tgs = tgs;
	}

	@Override
	public void move() {
		tgs.move();
		System.out.println("fish is moving");
	}
	
}
