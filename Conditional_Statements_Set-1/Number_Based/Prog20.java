/*

Write a Java Program to check whether the ASCII value of a character is even or odd.

*/

import java.util.Scanner;
public class Prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int num = (int)ch;
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}