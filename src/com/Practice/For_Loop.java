package com.Practice;

public class For_Loop {

	public static void main(String[] args) {

		
		int row = 5;
		for (int i = 5; i >1; i--) {

			for (int j = 1; j <=5;  j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		

	}

	

}
