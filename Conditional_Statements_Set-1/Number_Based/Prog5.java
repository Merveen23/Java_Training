/*

Write a Java Program to check whether a number is a 3-digit number or not.

*/

import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 100 && num <= 999)
            System.out.println("3 Digit Number");
        else
            System.out.println("Not a 3 Digit Number");
    }
}