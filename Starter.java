package com.accenture;

public class Starter {

	public static void main(String[] args) 
	{
		Employee e=new Manager();
		//it will show an error because reference is given of employee class and there is no m1() in Employee class
		//this is called static binding,it check which class's reference has been given
		e.m1();
		//dynamic binding--->at run time it will check what object has been assigned to the ref
	}

}
