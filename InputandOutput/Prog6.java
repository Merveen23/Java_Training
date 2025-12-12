/*

Write a Java Program to print the given fractional number in 2-digit decimal format.

*/

import java.util.Scanner;
public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.printf("%.2f",f);
    }
}