/*

Write a Java Program to find surface area and volume of a cuboid.

*/

import java.util.Scanner;
public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double surface_area = 2 * (l*w + l*h + w*h);
        double volume = l * w * h;
        System.out.println(surface_area);
        System.out.println(volume);
    }
}
