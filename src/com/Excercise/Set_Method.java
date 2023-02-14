package com.Excercise;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Method {

	public static void main(String[] args) {

		Set<Integer> s = new LinkedHashSet<Integer>();

		// Add

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println(s);

		// Size

		System.out.println(s.size());

		// Get error and set method not available

		System.out.println(s.getClass());

		// IsEmpty

		System.out.println(s.isEmpty());

		// indexOf not available

		System.out.println(s.contains(20));

		s.remove(20);
		System.out.println(s);

		s.removeAll(s);
		System.out.println(s);
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		
		s1.add(10);
		s1.add(60);
		s1.add(40);
		s1.add(70);
		s1.add(80);
		
		System.out.println(s1);
		
		//addAll
		
		s.addAll(s1);
		System.out.println(s);
		
		// retainAll
		
		s.retainAll(s1);
		System.out.println(s);
		
		// removeAll
		
		s.removeAll(s1);
		System.out.println(s);
	

		
		
	}

}
