package com.kiet;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Circle implements Shape {
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Circle Object is Created ");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
		System.out.println("Circle Object is Created ");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
