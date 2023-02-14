package com.Types_of_String;

public class Upper_LowerCase_Contains {
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		
		String s1 = "WELCOME TO JAVA";
		
		//s.upperCase; RT = String
		
		String upperCase = s.toUpperCase();
		
		System.out.println(upperCase);
		
		//s.lowerCase; RT = String;
		
		String lowerCase = s1.toLowerCase();
		
		System.out.println(lowerCase);		
		
		// contains case sensitive; s.contains; RT = boolean
		
		boolean contains = s.contains("me");
		
		System.out.println(contains);
		
		
	}

}
