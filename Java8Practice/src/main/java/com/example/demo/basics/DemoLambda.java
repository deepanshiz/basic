package com.example.demo.basics;

import java.util.ArrayList;
import java.util.List;

interface DemoI
{
//	void print(); // by default public abstract
	void show(int i);
}

class DemoA implements DemoI
{
	public void show(int i)
	{
		System.out.println("inside Show DemoA class = " + i);
	}

//	@Override
//	public void print()
//	{
//		System.out.println("inside Print DemoA class");
//	}
}

public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoA a = new DemoA();
		a.show(6);
		
		DemoA obj;
		obj = new DemoA()
				{
					public void show()
					{
						System.out.println("Inside Anonymous Inner class ");
					}
				};
				
		obj.show(44);
		
		// Using Lambda Expression
		
		DemoI demo;
		demo = (i) ->
		{
			System.out.println("Inside Lambda Expression " + i);
		};
		
//		demo.show(23);
		
		demo = (i) -> System.out.println("Another Lambda expression ........ " + i);
		demo.show(87);
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		list.add(12);
//		list.add(211);
//		list.add(16);
//		list.add(121);
//		list.add(1756);
//		
//		list.forEach(i -> printList(i)); // Lambda
//		
//		list.remove(2);
//		
//		System.out.println("\n");
//		list.forEach(i -> System.out.println(i)); // Lambda
		
	}
	
	public static void printList(int i)
	{
		System.out.println(i);
	}

}
