/*

Write a java Program to Mangoes Discount (Buy 3 Get 1 Free) Find Total Amount need to pay

*/

import java.util.Scanner;
public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int price = sc.nextInt();
        int free = total / 4;
        int paid = total - free;
        int amount = paid * price;
        System.out.println(free);
        System.out.println(paid);
        System.out.println(amount);
    }
}