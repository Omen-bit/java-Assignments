package Demo;

import java.util.Scanner;

public class Salesman extends Employee {
	int noOfProducts;
	double comission;
	
	public Salesman() {
		
	}
	
    public Salesman(int empid,double salary,int noOfProducts,double comission) {
		super(empid,salary);
		this.noOfProducts=noOfProducts;
		this.comission=comission;
	}
    
    @Override
    public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter total number of items sold : ");
		this.noOfProducts=sc.nextInt();
		System.out.println("Enter Comission per item sold : ");
		this.comission=sc.nextDouble();
	}
    
    @Override
    public void display() {
		super.display();
		System.out.println("total number of items sold : " + noOfProducts);
		System.out.println("Comission per item sold : " + comission);
	}
    
    public void calculateComission() {
    	System.out.println("Total comission obtained : " + noOfProducts*comission);
    }

}
