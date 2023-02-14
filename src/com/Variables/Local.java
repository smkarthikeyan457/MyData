package com.Variables;

public class Local {

	/*
	 * Local variables:
	 * Create: within the method 
	 * Access: within the method
	 * Initialize: must be initialized 
	 * Life time: within the method
	 */

	public void stuName() {

		System.out.println("Karthikeyan");

	}

	public void stuId() {
		System.out.println(113209);

	}

	public void teamA() {
		int k = 10;
		int c = 15;
		System.out.println(k + "karthikeyan");
		System.out.println(k + c);

	}


	public static void main(String[] args) {

		Local stu = new Local();
		stu.stuName();
		stu.stuId();
		stu.teamA();

	}

}
