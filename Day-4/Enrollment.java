package com.darshan;

import java.util.Scanner;

public class Enrollment {
	
	public static int display(Scanner sc) {
		System.out.println("-------------------------------");
		System.out.println("0: Exit");
		System.out.println("1: Enter students detail: ");
		System.out.println("2: Display student: ");
		System.out.println("3: Find student: ");
		int choice=sc.nextInt();
		System.out.println("-------------------------------");
		
		return choice;
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total capacity of Cs department: ");
		int cs=sc.nextInt();
		System.out.println("Total capacity of Ai&Ds department: ");
		int aids=sc.nextInt();
				
		
		System.out.println("0: CS");
		System.out.println("1: AI & DS");
		int field=sc.nextInt();
		
		Student[][] cource = new Student[2][];
		int index=0;
		int choice;
		
		cource[0]=new Student[cs];
		cource[1]=new Student[aids];
		switch (field) {
		
		case 0:
			while((choice=display(sc))!=0) {
				switch (choice) {
				case 1:
					if(index<6) {
					cource[field][index]=new Student();
					cource[field][index].acceptStudent();
					index++;
					}
					else {
						System.out.println("Cource is full..!!");
					}
					break;
					
				case 2:
					for(int i=0;i<cs;i++) {
						if(cource[field][i]!=null) {
						cource[field][i].displayStudent();
						}
					}
					break;
				case 3:
					System.out.print("Enter Roll No.: ");
					int find=sc.nextInt();
					
					for(int i=0;i<cs;i++) {
						if(cource[field][i].getRollno()==(find)) {
							cource[field][i].displayStudent();
						break;
						}
						else if(i==cs) {
							System.out.println("No student found");						
						}
						
					}
					break;

				default:
					System.out.println("Wrong choice--");
					break;
				}
			}
		break;
		
		case 1:
			while((choice=display(sc))!=0) {
				switch (choice) {
				case 1:
					if(index<aids) {
					cource[field][index]=new Student();
					cource[field][index].acceptStudent();
					index++;
					}
					else {
						System.out.println("Cource is full..!!");
					}
					break;
					
				case 2:
					for(int i=0;i<aids;i++) {
						if(cource[field][i]!=null) {
						cource[field][i].displayStudent();
						}
					}
					break;
				case 3:
					System.out.print("Enter Roll No.: ");
					int find=sc.nextInt();
					
					for(int i=0;i<aids;i++) {
						if(cource[field][i].getRollno()==(find)) {
							cource[field][i].displayStudent();
						break;
						}
						else if(i==aids) {
							System.out.println("No student found");						
						}
						
					}
					break;

				default:
					System.out.println("Wrong choice--");
					break;
				}
			}
			break;

		default:
			System.out.println("Wrong choice--");
			break;
		}
		

	}

}
