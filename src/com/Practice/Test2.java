package com.Practice;

public class Test2 {

	public void empName(String name) {
		System.out.println("Employee Name :" + name);

	}

	public void empId(int id) {
		System.out.println("Employee Id =" + id);

	}

	public void empNumber(long num) {
		System.out.println("Employee Mobile Number :" + num);

	}

	public void empHeight(float height) {
		System.out.println("Employee Height :" + height);

	}

	public void empSalary(double salary) {
		System.out.println("Employee Salary :" + salary);

	}

	public static void main(String[] args) {
		Test2 emp = new Test2();
		emp.empName("Karthikeyan");
		emp.empId(113209);
		emp.empNumber(9000091000l);
		emp.empHeight(5.6f);
		emp.empSalary(35000.50);
		emp.empName("kavin");
		emp.empId(113210);
		emp.empNumber(9000091111l);
		emp.empHeight(5.4f);
		emp.empSalary(30000.50);

	}

}
