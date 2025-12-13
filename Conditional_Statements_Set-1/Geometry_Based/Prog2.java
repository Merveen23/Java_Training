/*

Write a Java Program to check whether a triangle is right-angled or not.

*/

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)))
            System.out.println("Right-angled Trinagle");
        else
            System.out.println("Not Right-angled Trinagle");
    }
}