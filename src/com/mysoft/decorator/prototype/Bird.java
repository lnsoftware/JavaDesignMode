package com.mysoft.decorator.prototype;

public class Bird extends Decorator {

	private TheGreatestSage tgs;
	
	public Bird(TheGreatestSage tgs) {
		super(tgs);
		this.tgs = tgs;
	}

	@Override
	public void move() {
		tgs.move();
		System.out.println("bird is moving");
	}

}
