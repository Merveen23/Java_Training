/*

Write a java Program to print Price After Discount

*/

import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = sc.nextDouble();
        double discount_amount = (price*discount)/100;
        double final_price = price - discount_amount;
        System.out.println(final_price);
    }
}
