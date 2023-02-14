package com.abstractClass_Interface;

public class School implements Boy {

	@Override
	public void boyName(String name) {
		
		System.out.println("Boy name = "+name);
		
	}

	@Override
	public void boyID(int id) {
		System.out.println("boy id = "+id);
	}

	public static void main(String[] args) {
		School s = new School();
		s.boyName("Karthikeyan");
		s.boyID(113209);
		System.out.println();
		s.boyName("Gopal");
		s.boyID(113210);
	}
	
}
