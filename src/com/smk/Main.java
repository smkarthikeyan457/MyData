package com.smk;

public class Main extends HelloClass2 {

	
	@Override
	public void printHello() {

		System.out.println("Hi Java");
	}
	public static void main(String[] args) {

		HelloClass obj = new HelloClass();
		obj.printHello();

		HelloClass1 obj1 = new HelloClass1();
		obj1.printHello();

		Main obj3 = new Main();
		obj3.printHello();

	}

}
