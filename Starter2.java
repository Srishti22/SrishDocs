package com.accenture;

public class Starter2 {

	public static void main(String[] args) {
		
		Car2 car1 =new Car2();
		car1.brand="BMW";
		System.out.println("BMW");
		car1.change(car1);
		System.out.println(car1.brand);
		
	}

}
