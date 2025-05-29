package com.kiet;

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
	//@Autowired
	
	Shape c;

	public DrawingApp(@Qualifier("square") Shape c) {
		super();
		this.c = c;
		System.out.println("Drawing App Object Created");
	}

	public void draw() {
		System.out.println(c);
	}

	//@Autowired
	public void setC(Shape c) {
		this.c = c;
	}
}
