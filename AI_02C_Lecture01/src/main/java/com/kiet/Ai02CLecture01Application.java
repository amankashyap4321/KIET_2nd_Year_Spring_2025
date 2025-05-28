package com.kiet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Ai02CLecture01Application {
	

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Ai02CLecture01Application.class);
		DrawingApp d = context.getBean(DrawingApp.class);
		d.draw();
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		
	}

}
