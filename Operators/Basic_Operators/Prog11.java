/*

Write a Java Program to print the middle digit of a 3-digit number

*/

import java.util.Scanner;
public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = (a/10)%10;
        System.out.println(sum);
    }
}