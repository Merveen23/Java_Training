/*

Write a Java Program to check whether the first digit of a 3-digit number is odd or even.

*/

import java.util.Scanner;
public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = num/100;
        if(digit%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}