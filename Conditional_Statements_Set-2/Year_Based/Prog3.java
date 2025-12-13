/*

Write a Java Program to check whether the first two digits and last two digits of a year are equal

*/

import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int a = year%100;
        int b = year/100;
        if(a==b)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}