package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.interfaces.ClassA;
import com.example.demo.interfaces.TestI;

@SpringBootApplication
public class Java8PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Java8PracticeApplication.class, args);
		
		ClassA a = context.getBean(ClassA.class);
		
		
		a.print();
		a.printDeafult();
		
		TestI.printStatic();
	}

}
