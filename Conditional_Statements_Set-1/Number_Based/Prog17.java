/*

Write a Java Program to check whether two numbers have the same last digit.

*/

import java.util.Scanner;
public class Prog17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1%10==num2%10)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}