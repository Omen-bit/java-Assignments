package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit() {
		this.color="";
		this.weight=0.0;
		this.name="";
		this.isFresh=true;
	}
	
	public Fruit(String colour,double weight,String name,boolean isFreash) {
		this.color=colour;
		this.weight=weight;
		this.name=name;
		this.isFresh=isFreash;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter Fruit Details..");
		System.out.print("Enter fruit Colour : ");
		this.color=sc.next();
		System.out.print("Enter fruit Weight : ");
		this.weight=sc.nextDouble();
		System.out.print("Enter fruit Name : ");
		this.name=sc.next();
		System.out.println();

	}

	public String getName() {
		return name;
	}
	
	

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";
	}
	
	@Override
	public String toString() {
		return "[Name=" + name  + ", Weight=" + weight + ", Color=" + color + ", Taste=" + taste() +"]";
	}
	
	
	
	

}
