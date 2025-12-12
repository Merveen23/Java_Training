/*

Write a Java Program to check whether a number is positive or negative.

*/

import java.util.Scanner;
public class Prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sum = (a>0)?"Positive":"Negative";
        System.out.println(sum);
    }
}