package com.priyalearning.Spring_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		
		return "Creating springboot project and docker file and pushing it to git hub";
	}
}
