/*

Write a Java Program to find surface area and volume of a cylinder.

*/

import java.util.Scanner;
public class Prog15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double surface_area = 2 * Math.PI * r *(r + h);
        double volume = Math.PI * r * r * h;
        System.out.println(surface_area);
        System.out.println(volume);
    }
}
