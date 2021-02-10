package com.example.demo.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();

		list.add(12);
		list.add(34);
		list.add(54);
		list.add(16);
		list.add(89);
		
		list.forEach(i -> System.out.println(i));
		System.out.println("\n");
		
		Comparator<Integer> cmp = Collections.reverseOrder();
		Collections.sort(list, cmp);

		list.forEach(i -> System.out.println(i));
	}

}
