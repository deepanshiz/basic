package com.example.demo.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//
//class DemoConsumer implements Consumer<Integer>
//{
//
//	public void accept(Integer t) {
//		System.out.println("Inside Consumer Demo class " + t);
//	}
//	
//}

public class DemoForEach {

	public static void main(String[] args) {

		
//		List<Integer> list = new ArrayList<Integer>();		
//		list.add(12);
//		list.add(211);
//		list.add(16);
//		list.add(121);
//		list.add(1756);
		
		List<Integer> list = Arrays.asList(2,53,642,11,45);
//		list.forEach(i -> printList(i));
		
//		list.remove(3);	// UnsupportedOperationException in case list is a Arrays representation
//		list.add(33);	// UnsupportedOperationException in case list is a Arrays representation
		
//		System.out.println("");
//		list.forEach(i -> System.out.println(i));
		
		// Inner Anonymous Class
//		Consumer<Integer> cons = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//			
//		};
//		
//		list.forEach(cons );
		
//		Consumer<Integer> cons = (Integer i) -> System.out.println(i);
//		Consumer<Integer> cons =  i -> System.out.println(i);

		list.forEach(i -> System.out.println(i));
	}
	
	public static void printList(int i)
	{
		System.out.println(i);
	}

}
