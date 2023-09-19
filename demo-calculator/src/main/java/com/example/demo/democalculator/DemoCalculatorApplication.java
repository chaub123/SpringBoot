package com.example.demo.democalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoCalculatorApplication {

	private static ConfigurableApplicationContext context;
	private static String[] beans;

	public static void main(String[] args) {
		context = SpringApplication.run(DemoCalculatorApplication.class, args);
		beans = context.getBeanDefinitionNames();
	}

	public String[] getBean(){
		return beans;
	}

}
