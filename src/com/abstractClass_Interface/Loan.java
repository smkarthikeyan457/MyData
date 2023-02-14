package com.abstractClass_Interface;

public class Loan extends Bank {

	@Override
	public void goldLoan() {
		System.out.println("gold loan is 70%");
		
	}
	@Override
	public void bikeLoan() {
		System.out.println("bike loan is 80%");
	}
	

	public static void main(String[] args) {

		Loan l = new Loan();
		l.bikeLoan();
		l.carLoan();
		l.goldLoan();
		
		

	}



	

	

}
