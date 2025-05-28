package com.kiet;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class Circle implements Shape{
	private int radius;

	public Circle() {
		super();
		System.out.println("Circle Object Created");
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		System.out.println("Circle Object Created");
		this.radius = radius;
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
