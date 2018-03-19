package com.accenture;

public class Car {
	
   String color;
   int power;
   public Car()
   {
	   System.out.println("in constructor 1");
	   color="white";
	   power=110;
   }
   public Car(String c,int p)
   {
	   System.out.println("in constructor 2");
	   color=c;
	   power=p;
   }
   public void start()
   {
	   System.out.println("car is starting");
   }
   public void stop()
   {
	   System.out.println("car is stopping");
   }
} 
