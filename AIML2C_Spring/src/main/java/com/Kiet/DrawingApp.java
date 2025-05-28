package com.Kiet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy

public class DrawingApp {
	Shape s;

	//@Autowired
	public DrawingApp(@Qualifier("rectangle")  Shape s) {
		super();
		this.s = s;
		System.out.println("Drawing App Object Created");
	}


	void draw() {
		System.out.println(s);
	}
	
	
}
