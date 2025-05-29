package com.kiet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@RequestMapping("/hello")
	public String Hello() {
		return "Hello User This is The First Call";
	}
}
