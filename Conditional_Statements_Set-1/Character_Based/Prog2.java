/*

Write a Java Program to check whether a character is uppercase, lowercase, digit, or special symbol.

*/

import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("Lowercase");
        else if(ch>='A' && ch<='Z')
            System.out.println("Uppercase");
        else if(ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Characters");
    }
}