package com.kiet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
//@SpringBootApplication
public class Ai2BSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Ai2BSpringApplication.class, args);
		var context = new AnnotationConfigApplicationContext(Ai2BSpringApplication.class);
		DrawingApp d = context.getBean(DrawingApp.class);
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		d.draw();
	}

}
