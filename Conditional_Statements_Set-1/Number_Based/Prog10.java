/*

Write a Java Program to check whether the sum of two numbers is even or odd.

*/

import java.util.Scanner;
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        if(sum%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}