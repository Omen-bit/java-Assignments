package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	public static int size(Scanner sc) {
		System.out.println("Enter the size of the basket: ");
		int size=sc.nextInt();
		
		return size;
	}
	
	
	public static int menu(Scanner sc) {
		
		System.out.println("Welcome to fruit basket");
		System.out.println("------------------------------------------------------");
		System.out.println("0 : EXIT");
		System.out.println("1 : Add Mango");
		System.out.println("2 : Add Orange");
		System.out.println("3 : Add Apple");
		System.out.println("4 : Display fruits in the basket");
		System.out.println("5 : Display fresh fruits in the basket");
		System.out.println("6 : Mark fruit as stale");
		System.out.println("7 : Display taste of all stale fruit in the basket");
		System.out.println("------------------------------------------------------");
		System.out.print("Enter your choice : ");
		int choice=sc.nextInt();
		System.out.println();
		
		return choice;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int index=0;
		int size=size(sc);
		
		Fruit[] fr=new Fruit[size];
		
		while((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				if(index<size) {
				fr[index]=new Mango();
				fr[index].accept(sc);
				fr[index].setFresh(true);
				index++;
				}
				else {
					System.out.println("Fruit Basket Full..!!");
				}
				break;
				
			case 2:
				if(index<size) {
					fr[index]=new Orange();
					fr[index].accept(sc);
					fr[index].setFresh(true);
					index++;
					
					}
					else {
						System.out.println("Fruit Basket Full..!!");
					}
				break;
				
			case 3:
				if(index<size) {
					fr[index]=new Apple();
					fr[index].accept(sc);
					fr[index].setFresh(true);
					index++;
					}
					else {
						System.out.println("Fruit Basket Full..!!");
					}
				
				break;
				
			case 4:
				for(int i=0;i<fr.length;i++) {
					if(fr[i]!=null) {
						System.out.println(fr[i].getName());
					}
				}
				break;
				
			case 5:
				for(int i=0;i<fr.length;i++) {
					if(fr[i]!=null && (fr[i].isFresh()==true)) {
						System.out.println(fr[i].toString());
						System.out.println();
					}
				}
				break;
				
			case 6:
				System.out.print("Enter the index of stale fruit : ");
				int stale=sc.nextInt();
				fr[stale].setFresh(false);
				
				break;
				
			case 7:
				for(int i=0;i<size;i++) {
					if(fr[i]!=null && fr[i].isFresh()==false) {
						System.out.println(fr[i].toString());
						System.out.println();
						}
				}
				break;

			default:
				System.out.println("Wrong Choice..");
				break;
			}
		}
		
	}

}
