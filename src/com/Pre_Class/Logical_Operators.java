package com.Pre_Class;

public class Logical_Operators {
	

	public static void main(String[] args) {
		
		/*
		&& - And operator
		|| - Or operator - any one condition true display results
		! - Not operator - It will give results as true=false, false=true
		*/

		
		
		int age = 45;//here we can change age
		boolean voting_registered = true;//here we can change true or false

		if (age >= 18) {
			if (voting_registered) {
				System.out.println("You can vote.");

			} else {
				System.out.println("You are not eligible to vote.");
			}

		}else {
			System.out.println("You are not eligible to vote.");
		}

	}

}
