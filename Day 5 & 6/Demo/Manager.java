package Demo;

import java.util.Scanner;

public class Manager extends Employee {
	double bonous;
	
	public Manager() {
		
	}
	
    public Manager(int empid,double salary,double bonous) {
    	super(empid,salary);
		this.bonous=bonous;
	}
    
    @Override
    public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Bonous amount : ");
		this.bonous=sc.nextDouble();
	}
    
    @Override
    public void display() {
		super.display();
		System.out.println("Bonous Amount : " + bonous);
	}
	
	

}
