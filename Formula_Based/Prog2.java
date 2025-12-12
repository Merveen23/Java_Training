/*

Write a Java Program to find the area of a square.

*/

import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area = (s*s);
        System.out.println(area);
    }
}