/*

Write a Java Program to print the given hexadecimal number in integer format.

*/

import java.util.Scanner;
public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = Integer.toHexString(a);
        System.out.println(str);
    }
}