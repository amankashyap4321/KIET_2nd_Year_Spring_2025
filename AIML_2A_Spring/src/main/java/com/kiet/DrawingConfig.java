package com.kiet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class DrawingConfig {
	@Bean
	public Circle getCircle() {
		return new Circle();
	}

	@Bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle();
	}
	
	@Bean
	public DrawingApp getDrawingApp(Shape s) {
		return new DrawingApp(s);
	}
}
