package com.Kiet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Aiml2BLecture01Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Aiml2BLecture01Application.class);
		DrawingApp d= context.getBean(DrawingApp.class);
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		d.draw();
	}

}
