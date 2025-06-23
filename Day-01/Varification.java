import java.util.Scanner;
public class Varification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1=0,num2=0;
		
		System.out.print("Enter the first number: ");
	
			if(!sc.hasNextDouble() ||  sc.hasNextInt()) {
				System.out.print("The entered number is not a double");
				return ;
			}
			
			num1=sc.nextDouble();
			
			System.out.print("Enter the Second number: ");
			
			if(!sc.hasNextDouble() || sc.hasNextInt()) {
				System.out.print("The enteredd number is not a double");
				return ;
			}
			
			num2=sc.nextDouble();
			
			double avg=(num1+num2)/2;
			System.out.println(avg);
			
		
	   

	}

}
