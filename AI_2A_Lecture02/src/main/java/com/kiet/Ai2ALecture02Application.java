package com.kiet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Ai2ALecture02Application {

	public static void main(String[] args) {
		// SpringApplication.run(Ai2ALecture02Application.class, args);
		//var context = new AnnotationConfigApplicationContext(DrawingConfig.class);
		var context = new AnnotationConfigApplicationContext(Ai2ALecture02Application.class);

	
		DrawingApp d =  context.getBean(DrawingApp.class);
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		d.draw();

	}

}
