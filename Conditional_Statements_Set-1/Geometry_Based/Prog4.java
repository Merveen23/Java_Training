/*

Write a Java Program to check whether the sum of three angles forms a valid triangle.

*/

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > 0 && b > 0 && c > 0 && (a + b + c == 180))
            System.out.println("Valid Trinagle");
        else
            System.out.println("Not a valid Trinagle");
    }
}