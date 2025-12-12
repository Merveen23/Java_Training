/*

Write a Java Program to print an integer with a plus sign (+) before it.

*/

import java.util.Scanner;
public class Prog19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("+"+a);
    }
}