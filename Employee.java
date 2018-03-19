package com.accenture;

public class Employee 
{
		
		int empId;
		String empName;
		float salary;
		public void login()
		{
		System.out.println("employee logged in");
		}
		public Employee()
		{
			System.out.println("Employee class's default constructor");
		}
		public Employee(int empId, String empName, float salary)
		{
			//super();
			System.out.println("in parametrized const of parent");
			this.empId = empId;
			this.empName = empName;
			this.salary = salary;
		}
}


