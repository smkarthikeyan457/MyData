package com.Variables;

public class Final {

	final int fa = 5;

	private void teamB() {

		int fa = 10;
		System.out.println(fa);

		System.out.println(this.fa + 1);

	}

	public static void main(String[] args) {

		Final fin = new Final();
		fin.teamB();

	}
}
/* Final Variable:
 * Create: within the class, outside the method, with final keyword.
 * Access: throughout the class, in the main method, need to use object.
 * Initialize: Final variable value must be initialized..
 * Life Time: Throughout the class.
 * ***When local variable and the final variable are having the same NAME, then priority goes to local variable.
 * ***Final variable value never can be changed.
 */