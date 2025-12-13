/*

Write a Java Program to convert Celsius to Fahrenheit.

*/

import java.util.Scanner;
public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9.0 / 5.0) + 32;
        System.out.println(f);
    }
}