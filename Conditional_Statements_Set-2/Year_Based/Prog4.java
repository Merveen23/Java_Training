/*

Write a Java Program to check whether two given years have the same last digit.

*/

import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year1 = sc.nextInt();
        int year2 = sc.nextInt();
        int a = year1%10;
        int b = year2%10;
        if(a==b)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}