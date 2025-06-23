package com.app.geomentry;

import java.util.Scanner;
import java.lang.Math;

class Point2D{
	private int xAxis=0;
	private int yAxis=0;

	public Point2D(int x,int y){
		this.xAxis=x;
		this.yAxis=y;
	}

	public int getxAxis() {
		return xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}
	
	
}

public class Cordinates {
	
	public static double calculateDistance(Point2D p1,Point2D p2) {
		int x=p2.getxAxis()-p1.getxAxis();
		int y=p2.getyAxis()-p1.getyAxis();
		
		int result=x*x+y*y;
		double answer=Math.sqrt(result);
		return answer;
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point2D p1=new Point2D(2,3);
		Point2D p2=new Point2D(5,7);
		
		double answer=calculateDistance(p1,p2);
		System.out.println(answer);
		
		
	}
}
