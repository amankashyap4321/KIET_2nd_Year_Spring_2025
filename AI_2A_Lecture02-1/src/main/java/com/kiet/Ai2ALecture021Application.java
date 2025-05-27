package com.kiet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Ai2ALecture021Application {


	public static void main(String[] args) {
		//SpringApplication.run(Ai2ALecture021Application.class, args);
		var context= new AnnotationConfigApplicationContext(Ai2ALecture021Application.class);
		DrawingApp d =context.getBean(DrawingApp.class);
		d.draw();
	}

}
