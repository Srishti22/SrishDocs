package com.accenture;

public class Starter {

	public static void main(String[] args) 
	{	
		int price=1000;
		String col=new String("Red");
		
		//Engine e=new Engine(100,"V6");
		//below line is the case of aggregation
		//Car c=new Car(price,col,e);
		//below is the case of composition because we have directly passed the value 
		Car c=new Car(price,col,new Engine(100,"V6"));
		System.out.println("price is:"+c.getPrice());
		System.out.println("color is:"+c.getColor());
		System.out.println(c.getEng().getType());
		System.out.println(c.getEng().getPower());
		
	}

}

