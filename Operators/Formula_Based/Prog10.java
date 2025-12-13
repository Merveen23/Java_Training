/*

Write a Java Program to find the perimeter of a triangle.

*/

import java.util.Scanner;
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int perimeter = a + b + c;
        System.out.println(perimeter);
    }
}