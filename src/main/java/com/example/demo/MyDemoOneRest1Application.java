package com.example.demo;

import com.example.demo.entity.ContactDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {ContactDetails.class})
public class MyDemoOneRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyDemoOneRest1Application.class, args);
	}

}
