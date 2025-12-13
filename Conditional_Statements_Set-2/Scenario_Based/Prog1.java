/*

Write a java Program to calculate different discount for different Bill amount

*/

import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount = 0;

        if (bill<=0) {
            System.out.println("Invalid Bill Amount");
            return;
        }      
        if(bill>=5000)
            discount = bill * 0.20;
        else if(bill>=3000)
            discount = bill * 0.15;
        else if(bill>=1000)
            discount = bill * 0.10;
        else
            discount = bill * 0.05;

        System.out.println("Discount Amount: "+discount);
        System.out.println("Final Amount: "+(bill - discount));
    }
}