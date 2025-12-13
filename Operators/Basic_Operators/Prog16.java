/*

Write a Java Program to check whether two numbers are equal (true/false)

*/

import java.util.Scanner;
public class Prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean sum = (a==b)?true:false;
        System.out.println(sum);
    }
}