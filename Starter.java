package com.accenture;

public class Starter {

	public static void main(String[] args) {
		System.out.println("first line is main method");
		
		Car c=new Car();
		//c.color="red";
		//c.power=100;
		
		System.out.println("color is :"+c.color);
		System.out.println("power is :"+c.power);
		System.out.println("---------------creation of second object-------------");
		
		Car c1=new Car("red",300);
		//c1.color="blue";
		//c1.power=200;
		System.out.println(c1.color);
		System.out.println(c1.power);
		
		c.start();
		c.stop();
		c1.start();
		c1.stop();
	
		
	}

}
