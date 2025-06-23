package package3;

import java.util.Scanner;

class DateValidation{
	private int date;
	private int month;
	private int year;
	
	
	
	public void display() {
		System.out.println("date(dd/mm/yyyy) : ("+ date + "/" + month + "/" + + year+")");
	}
	
	public DateValidation(int date,int month,int year) {
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	public DateValidation() {
		
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}


public class Date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		DateValidation oldDt=new DateValidation(13,13,2013);
		oldDt.display();
		
		DateValidation newdt=new DateValidation();
				
		System.out.print("Enter Todays Date: ");
		int date=sc.nextInt();
		System.out.print("Enter Month of the year: ");
		int month=sc.nextInt();
		System.out.print("Enter Year: ");
		int year=sc.nextInt();
		
		newdt.setDate(date);
		newdt.setMonth(month);
		newdt.setYear(year);
		
		newdt.display();
	}

}
