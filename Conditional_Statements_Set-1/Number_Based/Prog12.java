/*

Write a Java Program to check whether the last digit of a number is odd or even.

*/

import java.util.Scanner;
public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = num%10;
        if(digit%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}