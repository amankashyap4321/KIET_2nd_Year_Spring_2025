package com.kiet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	@Autowired
	Shape c;

//	public DrawingApp(Shape c) {
//		super();
//		this.c = c;
//	}

	public void draw() {
		System.out.println(c);
	}

	//@Autowired
	public void setC(Shape c) {
		this.c = c;
	}
}
