/*

Write a Java Program to check whether a character is alphabet or not.

*/

import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            System.out.println("Alphabet");
        else
            System.out.println("Not a Albhabet");
    }
}