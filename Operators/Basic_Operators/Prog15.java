/*

Write a Java Program to calculate the average of three numbers

*/

import java.util.Scanner;
public class Prog15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a+b+c)/3;
        System.out.println(sum);
    }
}