/*

Write a Java Program to check whether the difference between two numbers is even or odd.

*/

import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int diff = num2 - num1; 
        if(diff%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}