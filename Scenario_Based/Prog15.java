/*

Write a java Program to Currency Notes from ATM

*/

import java.util.Scanner;
public class Prog15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int n2000 = amount / 2000;
        amount = amount % 2000;

        int n500 = amount / 500;
        amount = amount % 500;

        int n200 = amount / 200;
        amount = amount % 200;

        int n100 = amount / 100;
        amount = amount % 100;

        System.out.println(n2000);
        System.out.println(n500);
        System.out.println(n200);
        System.out.println(n100);
    }
}