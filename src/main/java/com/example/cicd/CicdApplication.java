package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class CicdApplication {

	@GetMapping("/wecome")
	public String welcome(){
		return "welcome to javatechie";
	}
//	echo "# Github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Deepsault/Github-actions-example.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
