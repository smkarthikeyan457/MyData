package com.Types_of_String;

public class String_equals {

	public static void main(String[] args) {

		String s = "Welcome";
		String s1 = "welcome";
		
		// equals case sensitive; s.equals(); RT = boolean

		boolean equals = s.equals(s1);

		System.out.println(equals);

		// equalsIgnoreCase not case sensitive; s.equalsIgnoreCase(); RT = boolean

		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);

		System.out.println(equalsIgnoreCase);

		// startsWith case sensitive; s.startsWith("Wel"); RT = boolean

		boolean startsWith = s.startsWith("Wel");
		
		System.out.println(startsWith);
		
		// endsWith case sensitive; s.endsWith("e"); RT = boolean

		boolean endsWith = s.endsWith("e");

		System.out.println(endsWith);

	}

}
