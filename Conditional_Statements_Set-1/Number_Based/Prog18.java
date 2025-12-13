/*

Write a Java Program to check whether a number is a single-digit, two-digit, or three-digit number.

*/

import java.util.Scanner;
public class Prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0 && num<10)
            System.out.println("Single Digit Number");
        else if(num>=10 && num<100)
            System.out.println("Two Digit Number");
        else if(num>=100 && num<1000)
            System.out.println("Three Digit Number");
        else
            System.out.println("More than three digits");
    }
}