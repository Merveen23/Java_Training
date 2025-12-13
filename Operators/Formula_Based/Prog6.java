/*

Write a Java Program to convert Fahrenheit to Celsius.

*/

import java.util.Scanner;
public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (5.0 / 9.0) * (f - 32);
        System.out.println(c);
    }
}