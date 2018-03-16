package com.accenture;

public class Employee 
{
	public int empid;
	public String empName;
	public float salary;
	
	public Employee()
	{
		System.out.println("const 1 is called");
		empid=1;
	}
	
	public Employee(int id,String st,float s)
	{
		System.out.println("const 2 is called");
		empid=id;
		empName=st;
		salary=s;
	}
	
	public Employee(int empid)
	{
		System.out.println("Constr 3 is called");
		this.empid=empid;
	}
}
