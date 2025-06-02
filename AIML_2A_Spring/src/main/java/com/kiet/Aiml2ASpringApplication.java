package com.kiet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@ComponentScan
public class Aiml2ASpringApplication {
		public static void main(String[] args) {
		//SpringApplication.run(Aiml2ASpringApplication.class, args);
		var context = new AnnotationConfigApplicationContext(Aiml2ASpringApplication.class);
		DrawingApp c = context.getBean(DrawingApp.class);
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		c.draw();
	}

}
