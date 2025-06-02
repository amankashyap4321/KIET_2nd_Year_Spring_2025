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
	private Shape c;

	public DrawingApp(@Qualifier("square") Shape c) {
		super();
		this.c = c;
		System.out.println("DrawingApp Object is Created and Dependency is Injected using Constructor");
	}

	//@Autowired
	public void setC(Shape c) {
		this.c = c;
		System.out.println("DrawingApp Object is Created and Dependency is Injected using Setter");
	}

	public void draw() {
		System.out.println(c);
	}
}
