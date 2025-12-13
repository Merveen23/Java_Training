/*

Write a java Program to Pens Discount (Buy 5, Pay for 3) Find Total Amount need to pay

*/

import java.util.Scanner;
public class Prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_pens = sc.nextInt();
        int price = sc.nextInt();
        int groups = total_pens / 5;
        int remaining = total_pens % 5;
        int paid_pens = (groups * 3) + remaining;
        int amount = paid_pens * price;
        System.out.println(paid_pens);
        System.out.println(amount);
    }
}