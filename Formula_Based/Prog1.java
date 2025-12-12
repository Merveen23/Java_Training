/*

Write a Java Program to find the area of a rectangle.

*/

import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int area = (l*w);
        System.out.println(area);
    }
}