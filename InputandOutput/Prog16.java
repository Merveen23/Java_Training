/*

Write a Java Program to print a character in single quotes.

*/

import java.util.Scanner;
public class Prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0); 
        System.out.printf("'%c'",ch);
    }
}