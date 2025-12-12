/*

Write a Java Program to print the given integer number in octal format.

*/

import java.util.Scanner;
public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = Integer.toOctalString(a);
        System.out.println(str);
    }
}