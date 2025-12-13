/*

Write a Java Program to find the area of a triangle.

*/

import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double area = (b*h)/2;
        System.out.println(area);
    }
}