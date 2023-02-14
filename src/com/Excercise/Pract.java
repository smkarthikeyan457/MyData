package com.Excercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pract {

	public static void main(String[] args) {

		Map m = new HashMap<Integer, String>();

		m.put(1, "Karthi");
		m.put(2, "Gopal");
		m.put(3, "Jk");
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue("Karthi"));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		// boolean remove = m.remove(2, "Gopal");
		System.out.println(m);

		for (Object i : m.keySet()) {
			System.out.println(i);

		}
		
		for (Object i : m.values()) {
			
			System.out.println(i);
		}
		
		for (Object i : m.keySet()) {
			
			System.out.println(i+" "+m.get(i));
			
		}
		
		

	}

}
