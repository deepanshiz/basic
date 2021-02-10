package com.example.demo.interfaces;

import org.springframework.stereotype.Component;

@Component
public class ClassA  extends ClassB{
	
	int id;
	String name;
	
	public ClassA()
	{
		System.out.println("Class A constructor ...... ");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
