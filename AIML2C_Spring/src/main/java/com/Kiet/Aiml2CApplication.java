package com.Kiet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan
public class Aiml2CApplication {
	

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Aiml2CApplication.class);
		DrawingApp d = (DrawingApp) context.getBean(DrawingApp.class);
		d.draw();
//		System.out.println(context.getBean(Rectangle.class).hashCode());
//		System.out.println(context.getBean(Rectangle.class).hashCode());
//		System.out.println(context.getBean(Rectangle.class).hashCode());
//		System.out.println(context.getBean(Rectangle.class).hashCode());
//		System.out.println(context.getBean(Circle.class).hashCode());
//		System.out.println(context.getBean(Circle.class).hashCode());
//		System.out.println(context.getBean(Circle.class).hashCode());
//		System.out.println(context.getBean(Circle.class).hashCode());
	}

}
