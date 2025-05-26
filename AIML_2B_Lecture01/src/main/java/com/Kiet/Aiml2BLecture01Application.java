package com.Kiet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aiml2BLecture01Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(DrawingConfig.class);
		Circle c = context.getBean(Circle.class);
		System.out.println(c);
	}

}
