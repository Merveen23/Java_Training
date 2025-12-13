/*

Write a java program to apply % of discount based on purchase amount.

*/

import java.util.Scanner;
public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount<=0) {
            System.out.println("Invalid Bill Amount");
            return;
        }      
        if(amount>=10000)
            discount = amount * 0.20;
        else if(amount>=5000)
            discount = amount * 0.15;
        else if(amount>=3000)
            discount = amount * 0.10;
        else
            discount = amount * 0.05;

        System.out.println("Discount Amount: "+discount);
        System.out.println("Final Amount: "+(amount - discount));
    }
}