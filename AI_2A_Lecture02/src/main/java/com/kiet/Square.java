package com.kiet;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
//if Class is annotated with lazy annotation the 
//the Object of that class is created when required
@Qualifier("square")
public class Square implements Shape {
	private int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Square Object Created ");
	}

	public Square(int side) {
		super();
		this.side = side;
		System.out.println("Square Object Created ");
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
