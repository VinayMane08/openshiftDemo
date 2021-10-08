package com.openshiftDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test")
	public String getData() {
		return "Welcome to the Openshift Demo";
	}

}
