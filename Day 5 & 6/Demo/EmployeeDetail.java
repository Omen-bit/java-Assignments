package Demo;

import java.util.Scanner;

public class EmployeeDetail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 : EXIT");
		System.out.println("1 : Employee");
		System.out.println("2 : Manager");
		System.out.println("3 : Salesman");
		System.out.print("Enter your choice: ");
		
		int choice=sc.nextInt();
		
		Employee emp=null;
		
		switch (choice) {
		case 1:
			emp=new Employee();
			break;
		case 2:
			emp=new Manager();
			break;
		case 3:
			emp=new Salesman();
			break;
		default:
			System.out.println("Invalid Choice....!!");
			break;
		}
		emp.accept(sc);
		emp.display();
		
		if(emp instanceof Salesman) {
			Salesman s=(Salesman)emp;
			
			s.calculateComission();
		}
		

	}

}
