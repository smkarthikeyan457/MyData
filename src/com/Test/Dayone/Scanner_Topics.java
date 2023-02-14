package com.Test.Dayone;

import java.util.Scanner;

public class Scanner_Topics {
	
	public static void main(String[] args) {
		
		//Scanner + Ref name = new Scanner (System.in);
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter name :");
		String name = s.next();
		
		System.out.println("Enter age :");
		int age = s.nextInt();
		
		System.out.println("Enter mobile numebr :");
		long mobile = s.nextLong();
		
		System.out.println("Enter height :");
		float height = s.nextFloat();
		
		System.out.println("Enter Salary :");
		double salary = s.nextDouble();
		
		//Ref name.next() and then ctrl+2 then L and then remove next into any name
		
		
		
		
		
		
		
		System.out.println("Your name is "+ name);
		System.out.println("Your age is "+ age);
		System.out.println("Your mobile is "+ mobile);
		System.out.println("Your height is "+ height );
		System.out.println("Your salary is "+ salary);
		
		
		
		
		
	
		
		
	}

}

