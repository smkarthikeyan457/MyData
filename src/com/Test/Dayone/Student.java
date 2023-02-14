package com.Test.Dayone;

public class Student {
	
	
	
	public void stuName(String name) {
		System.out.println("Student Name =" + name);
	
	}
	
	private void jsk(String string) {
		System.out.println("paid" + string);
		

		
	}
	
	public static void main(String[] args) {
		
		Student S = new Student ();
		S.stuName("Karthikeyan");
		S.jsk ("unpaid"); 
	
				
		
	}

}
