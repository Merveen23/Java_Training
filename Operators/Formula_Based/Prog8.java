/*

Write a Java Program to find the perimeter of a square.

*/

import java.util.Scanner;
public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int perimeter = 4 * s;
        System.out.println(perimeter);
    }
}