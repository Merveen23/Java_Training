/*

Write a Java Program to print pass/fail result based on marks.

*/

import java.util.Scanner;
public class Prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = (a>50)?"Pass":"Fail";
        System.out.println(str);
    }
}