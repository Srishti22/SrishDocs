package com.accenture;

public class Starter {

	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int result=c.addition(10, 20);
		float res=c.addition(20,20.4f);
		System.out.println("addition 1:"+result);
		System.out.println("addition 2:"+res);

	}

}
