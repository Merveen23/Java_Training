/*

Write a Java Program to find greatest among two numbers.

*/

import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}