package com.Kiet;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("circle")
@Lazy
public class Circle implements Shape {
	private int radius;
	//No Argument
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Circle Object Is Created");
	}
	//Parameterized 
	public Circle(int radius) {
		super();
		this.radius = radius;
		System.out.println("Circle Object Is Created");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
