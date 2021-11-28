package com.in.test.neew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApplication {
	
	public static void main(String[] args) {
		String a[]  = new String[] { "A", "B", "C", "D" };
		List<String> al =new ArrayList<String>(Arrays.asList("mohan", "kv", "abc"));
		
		List<String> newAl = al.stream()
				.filter(p -> p.equals("mohan"))
				.collect(Collectors.toList());

		System.out.println(newAl);

		List<String> newAlw = al.stream()
				.filter(p -> p.equals("mohan"))
				.map(p -> p+"s")
				.collect(Collectors.toList());

		System.out.println(newAlw);
		
		List<String> newAlwd = al.stream()
				//.filter(p -> p.equals("mohan"))
				.sorted()
				.collect(Collectors.toList());

		System.out.println(newAlwd);
		
		///////////////////////////////////////////////////////////////
		List<Integer> alnew =new ArrayList<Integer>(Arrays.asList(29,98,7,0,56,87));
		Integer max = alnew.stream()
				.min((a1, b) -> a1>b ?1:-1).get();

		System.out.println(max);

		

	}

}
