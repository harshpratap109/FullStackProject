package com.nama.springboot.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication = @Configuration + @ComponentScan + @AutoConfiguration
@SpringBootApplication
public class FirstdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstdemoApplication.class, args);
	}

}
