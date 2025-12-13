/*

Write a Java Program to check whether the last digit of a number is divisible by 3.

*/

import java.util.Scanner;
public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last = num%10;
        if(last%3==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}