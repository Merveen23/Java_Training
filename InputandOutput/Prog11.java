/*

Write a Java Program to print the ASCII value of a character.

*/

import java.util.Scanner;
public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        System.out.println((int)ch); 
    }
}