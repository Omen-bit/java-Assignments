package Demo;

import java.util.Scanner;

public class Employee {
	private int empid;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empid,double salary) {
		this.empid=empid;
		this.salary=salary;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Employee ID : ");
		this.empid=sc.nextInt();
		System.out.println("Employee Salary : ");
		this.salary=sc.nextDouble();
	}
	
	public void display() {
		System.out.println("Employee Id : " + empid);
		System.out.println("Employee salary : " + salary);
	}
	
		
	

}
