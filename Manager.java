package com.accenture;

public class Manager extends Employee 
{
	int numOfReportees;
	public void approveLeaves()
	{
		System.out.println("leave approved by manager");
		super.empId=105;
	}
	public void login()
	{
		System.out.println("manager logged in from home");
	}
	public Manager()
	{
		System.out.println("in manager's default constructor");
	}
	public Manager(int id,String name,float sal,int numOfReportees)
	{
		//used to call parametrized const of base class
		super(id,name,sal);
		System.out.println("in parameterized const of child");
		this.numOfReportees = numOfReportees;
		//empId=id;
		//empName=name;
		//salary=sal;
		//System.out.println(this.numOfReportees);
	}
	
}
