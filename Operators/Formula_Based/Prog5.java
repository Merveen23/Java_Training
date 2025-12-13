/*

Write a Java Program to find the distance between two points.

*/

import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println(distance);
    }
}