package com.insurance.provider.com.insurance.provider;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class Application {

		
	@GetMapping("/")
	public List<String> getInsuranceTypes(){
		
		 return Stream.of("Jeevan Anand","Jeevan Beema","Jeevan Saral","Jeevan anoop","naga plan").collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
