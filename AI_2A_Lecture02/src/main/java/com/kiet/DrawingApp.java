package com.kiet;

import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	Shape c;

	public DrawingApp(Shape c) {
		super();
		this.c = c;
	}
	
	public void draw() {
		System.out.println(c);
	}
}
