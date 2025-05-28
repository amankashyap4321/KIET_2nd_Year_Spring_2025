package com.Kiet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrawingApp {
	//private Circle c;
	
	@Autowired
	@Qualifier("circle")
	private Shape c;

//	public DrawingApp(Circle c) {
//		super();
//		this.c = c;
//	}
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
