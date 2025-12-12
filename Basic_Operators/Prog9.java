/*

Write a Java Program to print all digits except the last digit of a given number N.

*/

import java.util.Scanner;
public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = a/10;
        System.out.println(sum);
    }
}