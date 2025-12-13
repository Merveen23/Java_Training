/*

Write a Java Program to check whether a number is divisible by either 3 or 7.

*/

import java.util.Scanner;
public class Prog15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3==0)
            System.out.println("Divisible by 3");   
        else if(num%7==0)
            System.out.println("Divisible by 7"); 
        else
            System.out.println("Not Divisible");
    }
}