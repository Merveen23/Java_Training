/*

Write a Java Program to check whether a number is positive, negative, or zero.

*/

import java.util.Scanner;
public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else if(num==0)
            System.out.println("Zero");
        else
            System.out.println("No Number");
    }
}