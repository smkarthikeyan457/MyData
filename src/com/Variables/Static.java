package com.Variables;

public class Static {

	static int a = 10;

	private void stu() {

		int a = 11;
		System.out.println(a);
		System.out.println(a);

	}

	public static void main(String[] args) {

		Static st = new Static();
		st.stu();
		System.out.println(a);

	}

}
/* Static Variable; Italic Word ======> Object not required
 * Create: within the class, outside the method, with static keyword.
 * Access: throughout the class, in the main method, no need to access object.
 * Initialize: no need, it will take the default value of the given data type.
 * Life Time: throughout the class
 * *** when the local variable and class variable are having the same NAME, then priority goes to local variable.
 */
 
 
