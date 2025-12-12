/*

Write a Java Program to print current time in the format HH:MM:SS.

*/

import java.util.Scanner;
public class Prog24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+":"+b+":"+c);
    }
}