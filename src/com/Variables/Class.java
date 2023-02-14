package com.Variables;

public class Class {
	//Class Variable
	
	int a = 5 ;
	int c = 6;
	String name = "Karthi";
	
	private void cls() {
		//Local Variable
		
		int d = 15;
		int a = 7;
		int c = 8;
		System.out.println(d);
	    System.out.println(a+d);
	    System.out.println(this.a+d);
	    System.out.println(this.a);
	    System.out.println(this.a+this.c);
	    System.out.println(c);
	    System.out.println(name);
	}
	
	public static void main(String[] args) {
		Class c = new Class();
		c.cls();
	
	}

}

/* Class Variable:
 * Create: within the class, outside the method.
 * Access: throughout the class, but when we access in the main method need to use object.
 * Initialize: no need, this will take the default value of the given data.
 * Life Time: throughout the class.
 * *** When the local variable and class variable are having the same "NAME", then priority goes to local variable.
 * *** Use this.name  Example: System.out.println(this.name); it is for get the class variable output instead of local variable output.
 */