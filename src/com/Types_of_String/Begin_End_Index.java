package com.Types_of_String;

public class Begin_End_Index {

	public static void main(String[] args) {

		String s = "Hello World";

		// begin index; RT = String

		String substring = s.substring(3);

		System.out.println(substring);

		// begin and end Index; RT = String

		String substring2 = s.substring(3, 8);

		System.out.println(substring2);

		// CharAt; pass the index and get the character; RT = 'char' only for charAt

		char charAt = s.charAt(7);

		System.out.println(charAt);

	}

}
