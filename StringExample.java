package com.accenture;

public class StringExample {

	public static void main(String[] args) 
	{
		/*String str1="Java";
		String str2="Java";
		
		String str3=new String("Java");
		String str4=new String("Java");
		
		if(str1==str2)
		{
			System.out.println("1");
		}
		if(str1==str3)
		{
			System.out.println("2");
		}
		if(str3==str4)
		{
			System.out.println("3");
		}
		if(str3.equals(str4))
			System.out.println("4");
		
		System.out.println("-------------string function-------------");
		String a="I love India.India is great";
		String b="country";
		String c= a.concat(b);
		System.out.println(c);
		System.out.println(a.indexOf('I'));
		System.out.println(a.substring(8));
		System.out.println(a.substring(8,12));
		System.out.println(a.toUpperCase());
		System.out.println(a.replace("great","beautiful"));
		String [] arr=a.split("/ / .");
		for(String s:arr)
		{
			System.out.println(s);
		}*/
		String st=new String("Java");
		String st1=st;
		st=st.toUpperCase();
		if(st==st1)
		{
			System.out.println("1");
		}
		else if(st.equals(st1))
		{
			System.out.println("2");
		}
		else
			System.out.println("3");
	}
		

}
