package com.Test.Dayone;

public class While {

	public static void main(String[] args) {

		for (int number = 1; number <= 5; number++) {
			System.out.println(number);

		}
		System.out.println("End");

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		System.out.println("end");
		int number = 1;

		while (number <= 5) {
			System.out.println(number);
			++number;

		}

		System.out.println("end");
		int a = 3;

		if (a == 1) {
			System.out.println("one");

		} else if (a == 2) {
			System.out.println("Two");

		} else {
			System.out.println("other number");

		}
		System.out.println("end");
		
		int b = 1;

		switch (b) {

		case 1:
			System.out.println("one");
			break;

		case 5:
			System.out.println("two");
			break;
		default:
			System.out.println("other number");

		}

		int c = 2;
		switch (c) {
		case 1:
			System.out.println("its one");
			
		case 2:
			System.out.println("its two");
			
		case 3:
			System.out.println("its three");

		default:
			System.out.println("out of value");
		
		}
		
		
	}

}
