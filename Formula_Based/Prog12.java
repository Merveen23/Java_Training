/*

Write a Java Program to find surface area, volume, and perimeter of a cube

*/

import java.util.Scanner;
public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int surface_area = 6 * a * a;
        int volume = a * a * a;
        int perimeter = 12 * a;
        System.out.println(surface_area);
        System.out.println(volume);
        System.out.println(perimeter);
    }
}
