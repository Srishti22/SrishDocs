package com.accenture;

public class Starter {

	 static
	 {
		 System.out.println("this is starter block");
	 }
	public static void main(String[] args) 
	{
		System.out.println("First Line in main");
		Employee e1=new Employee();
		
		System.out.println("First Line in main");
		Employee e2=new Employee();
		//JVM needs to load the Employee class first and hence static block will be executed
				/*e1.empid=101;
				e1.comName="Accenture";
				Employee e2=new Employee();
				System.out.println("emp2:"+e2.empid);
				System.out.println("company:"+e2.comName);
				//Employee.m1();
				e1.m1();*/
		
	}
}
