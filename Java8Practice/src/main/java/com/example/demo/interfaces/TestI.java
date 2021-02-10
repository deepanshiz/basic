package com.example.demo.interfaces;

public interface TestI {
	
	public abstract void print();
	
	default void printDeafult()
	{
		System.out.println("deafult method in Interface I");
	}
	
	static void printStatic()
	{
		System.out.println("static method in Interface I");
	}
}
