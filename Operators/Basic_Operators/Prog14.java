/*

Write a Java Program to print the cube of a number.

*/

import java.util.Scanner;
public class Prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = (a*a*a);
        System.out.println(sum);
    }
}