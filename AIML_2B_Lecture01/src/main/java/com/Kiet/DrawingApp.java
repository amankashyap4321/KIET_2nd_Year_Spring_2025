package com.Kiet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DrawingApp {
	//private Circle c;
	
	//@Autowired
	//@Qualifier("circle")
	private Shape s;

	public DrawingApp(@Qualifier("circle") Shape s) {
		super();
		this.s = s;
		System.out.println("Drawing app Object Is Created");
	}
//	public DrawingApp(Shape c) {
//		super();
//		this.c = c;
//	}

	public void draw() {
		System.out.println(s);
	}

	//@Autowired
	public void setC(Shape s) {
		this.s = s;
	}
}
