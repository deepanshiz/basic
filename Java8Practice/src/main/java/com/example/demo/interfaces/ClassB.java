package com.example.demo.interfaces;

import org.springframework.stereotype.Component;

@Component
public class ClassB implements TestI {
	
	public void show()
	{
		System.out.println("show method in class B ......");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print method in class B ......");
	}
	
}
