package com.kiet.AIML_2B_FirstRestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstrestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}
	
}
