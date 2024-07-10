package com.ivoyant.cicddemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicDdemoProjectApplication {

	@GetMapping("/api/test")
	public String testing(){
		return "this is first stage of project";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicDdemoProjectApplication.class, args);
	}

}
