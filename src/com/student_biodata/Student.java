package com.student_biodata;

public class Student {

	public void stuName(String name) {
		System.out.println("Student Name   : " + name);

	}

	public void stuId(int id) {
		System.out.println("Student Id     : " + id);

	}

	public void stuBranch(String branch) {

		System.out.println("Student Branch : " + branch);

	}
	
	public void stuPlace(String place) {
		System.out.println("Student Place  : "+ place);

	}

	public static void main(String[] args) {

		// class name + object name = keyword + class name ();
		Student s = new Student();

		// object.method
		s.stuName("Karthikeyan");
		s.stuId(113209);
		s.stuBranch("Mechanical Engineering");
		s.stuPlace("Tirupur");
		s.stuName("Hemalatha");
		s.stuId(113205);
		s.stuBranch("Electrical and Electronics Engineering");
		s.stuPlace("Palani");
		s.stuName("Gopal");
		s.stuId(113208);
		s.stuBranch("Mecghanical Engineering");
		s.stuPlace("Nampiyur");

	}

}
