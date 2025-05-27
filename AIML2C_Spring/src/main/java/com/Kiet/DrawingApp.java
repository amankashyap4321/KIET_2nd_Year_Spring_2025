package com.Kiet;

import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	Shape s;

	
	public DrawingApp(Shape s) {
		super();
		this.s = s;
	}


	void draw() {
		System.out.println(s);
	}
	
	
}
