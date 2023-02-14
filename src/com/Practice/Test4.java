package com.Practice;

public class Test4 {

	int c = 400;
	int b = 300;

	public void stu() {

		int a = 400;
		System.out.println(a);
		int b = 300;
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.b);

	}

	public static void main(String[] args) {

		Test4 ref = new Test4();
		ref.stu();

	}

}
