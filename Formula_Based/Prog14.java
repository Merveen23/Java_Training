/*

Write a Java Program to find surface area and volume of a sphere.

*/

import java.util.Scanner;
public class Prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double surface_area = 4 * Math.PI * r * r;
        double volume = (4.0/3.0) * Math.PI * r * r *r;
        System.out.println(surface_area);
        System.out.println(volume);
    }
}
