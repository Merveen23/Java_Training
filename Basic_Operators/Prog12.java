/*

Write a Java Program to print the absolute value of a number

*/

import java.util.Scanner;
public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = (a<0)?-a:a;
        System.out.println(sum);
    }
}