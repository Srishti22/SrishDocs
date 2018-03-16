package com.accenture;

public class Employee 
{
	int empid;
	String name;
	static String comName;
	static
	{
		comName="Accenture India";
		System.out.println("In static block1");
	}
	static
	{
		System.out.println("In static block2");
	}
	public Employee()
	{
		System.out.println("this is constructor");
	}
	static public void m1()
	{
		System.out.println("this is method 1");
	}
	
	
	
}
