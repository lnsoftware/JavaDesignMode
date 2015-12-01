package com.mysoft.decorator.prototype;

public class Decorator implements TheGreatestSage {

	private TheGreatestSage tgs;
	
	public Decorator(TheGreatestSage tgs){
		this.tgs = tgs;
	}
	
	@Override
	public void move() {
		tgs.move();
	}

}
