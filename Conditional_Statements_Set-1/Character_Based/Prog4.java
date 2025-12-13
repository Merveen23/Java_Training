/*

Write a Java Program to check whether a character is a digit or not.

*/

import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch>='0' || ch<='0')
            System.out.println("It is a Digit");
        else
            System.out.println("Not a Digit");
    }
}