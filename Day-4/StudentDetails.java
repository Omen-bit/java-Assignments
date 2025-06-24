package com.darshan;

import java.util.Scanner;

class Student {
	private int rollno;
	private String name;
	private double marks;
	
	public void acceptStudent(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll No. : ");
		this.rollno=sc.nextInt();
		System.out.print("Name: ");
		this.name=sc.next();
		System.out.print("Marks: ");
		this.marks=sc.nextDouble();
	}
	
	public int getRollno() {
		return rollno;
	}

	public void displayStudent() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}
	
}
	

public class StudentDetails {
	
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
		Scanner sc =new Scanner(System.in);
		Student[] s=new Student[5];
		int index=0;
		int choice;
		while((choice=display(sc))!=0) {
			switch (choice) {
			case 1:
				if(index<5) {
				s[index]=new Student();
				s[index].acceptStudent();
				index++;
				}
				else {
					System.out.println("Cource is full..!!");
				}
				break;
				
			case 2:
				for(int i=0;i<5;i++) {
					if(s[i]!=null) {
					s[i].displayStudent();
					}
				}
				break;
			case 3:
				System.out.print("Enter Roll No.: ");
				int find=sc.nextInt();
				
				for(int i=0;i<5;i++) {
					if(s[i].getRollno()==(find)) {
						s[i].displayStudent();
					break;
					}
					else if(i==5) {
						System.out.println("No student found");						
					}
					
				}
				break;

			default:
				System.out.println("Wrong choice--");
				break;
			}
		}


	}

}
