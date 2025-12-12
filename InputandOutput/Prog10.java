/*

Write a Java Program to print the given octal number in integer format.

*/

import java.util.Scanner;
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str,8);
        System.out.println(a);
    }
}