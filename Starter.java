package com.accenture;

public class Starter {

	public static void main(String[] args) 
	{
		//we can't create object of abstract class but can create a reference of abstract class
		Account acc=new HomeLoanAccount();
		acc.dispBalance();
		int res=acc.calcInterest();
		System.out.println(res);
		
	}

}
