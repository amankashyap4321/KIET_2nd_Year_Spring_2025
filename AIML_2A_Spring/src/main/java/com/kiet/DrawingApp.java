package com.kiet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DrawingApp {
	
	
	private Shape shape;
	
	public DrawingApp(@Qualifier("square") Shape shape) {
		super();
		this.shape = shape;
		System.out.println("Drawingapp Object is Created");
	}

	public void draw() {
		System.out.println(shape);
	}

	//@Autowired
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	
}
