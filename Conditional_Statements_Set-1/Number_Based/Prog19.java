/*

Write a Java Program to check whether the product of two numbers is positive or negative.

*/

import java.util.Scanner;
public class Prog19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = num1 * num2;
        if(product>0)
            System.err.println("Positive");
        else
            System.out.println("Negative");
    }
}