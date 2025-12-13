/*

Write a Java Program to find the area of a circle.

*/

import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println(area);
    }
}