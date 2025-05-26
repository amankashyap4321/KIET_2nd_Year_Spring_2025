package com.kiet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class DrawingConfig {
 
	@Bean
	public Circle getCircle() {
		return new Circle(12);
	}
	@Bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle(10,12);
	}
	@Bean
	//Telling Spring to Inject the dependency of shape type
	public DrawingApp getDrawingApp( Shape s) {
		return new DrawingApp(s);
	}
}
