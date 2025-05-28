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
//	@Autowired
//	@Qualifier("rectangle")
	private Shape c;

	public DrawingApp(Shape c) {
		super();
		System.out.println("Drawing App Object Created");
		this.c = c;
	}

	public void draw() {
		System.out.println(c);
	}

	//@Autowired
	public void setC(Shape c) {
		this.c = c;
	}
}
