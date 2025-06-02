package com.kiet.AIML_2A_FirstRestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}
}
