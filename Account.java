package com.accenture;

public abstract class Account 
{
	private int balance;
	Account()
	{
		System.out.println("constructor of abstract class");
	}
	public void dispBalance()
	{
		System.out.println("this is balance calculation");
	}
	public abstract int calcInterest();
}
