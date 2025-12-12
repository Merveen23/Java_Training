/*

Write a Java Program to print the given integer number in hexadecimal format.

*/

import java.util.Scanner;
public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str, 16);
        System.out.println(a);
    }
}