package Question1;

import java.util.Scanner;


public class Main {
	
	public static double calculation(double miles,double gas,double average,double parking,double toll) {
		return (gas * (miles/average)) + parking +toll;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Total miles driven per day : $");
		double miles=sc.nextDouble();
		System.out.print("Cost per gallon of gasoline. : $");
		double gas=sc.nextDouble();
		System.out.print("Average miles per gallon : $");
		double average=sc.nextDouble();
		System.out.print("Parking fees per day. : $");
		double parking=sc.nextDouble();
		System.out.print("Tolls per day. : $");
		double toll=sc.nextDouble();
		
		double result=calculation(miles,gas,average,parking,toll);
		
		System.out.println("Total cost today : $" + result);

	}

}
