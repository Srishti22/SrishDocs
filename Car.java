package com.accenture;

public class Car 
{
	private int price;
	private String color;
	private Engine eng;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	public Car(int price, String color, Engine eng) {
		//super();
		System.out.println("in class Car");
		this.price = price;
		this.color = color;
		this.eng = eng;
	}
}
