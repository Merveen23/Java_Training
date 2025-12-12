/*

Write a Java Program to print your date of birth in the format DD/MM/YYYY.

*/

import java.util.Scanner;
public class Prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+"/"+b+"/"+c);
    }
}