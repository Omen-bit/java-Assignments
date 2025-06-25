package package3;

import java.util.Scanner;

class Point2D {
    private int xAxis = 0;
    private int yAxis = 0;

    public Point2D(int x, int y) {
        this.xAxis = x;
        this.yAxis = y;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public String getDetails() {
        return "(" + xAxis + ", " + yAxis + ")";
    }

    public boolean isEqual(Point2D other) {
        return this.xAxis == other.xAxis && this.yAxis == other.yAxis;
    }
}

public class Coordinates {

    public static double calculateDistance(Point2D p1, Point2D p2) {
        int x = p2.getxAxis() - p1.getxAxis();
        int y = p2.getyAxis() - p1.getyAxis();

        int result = x * x + y * y;
        double answer = Math.sqrt(result);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and y for Point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        Point2D p1 = new Point2D(x1, y1);

        System.out.print("Enter x and y for Point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Both points are equal.");
        }
        else
        {
            double answer = calculateDistance(p1, p2);
            System.out.println("Distance between points: " + answer);
        }

    }
}
