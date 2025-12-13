/*

Write a java program to calculate water bill using slab rates 
(≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).

*/

import java.util.Scanner;
public class Prog18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litres = sc.nextInt();
        double bill = 0;

        if (litres<0) {
            System.out.println("Invalid Consumption");
            return;
        }      
        if(litres<=1000)
            bill = 0;
        else if(litres<=3000)
            bill = ((litres - 1000) / 1000.0) * 5;
        else
            bill = (2000 / 1000.0) * 5 + ((litres - 3000) / 1000.0) * 10;

        System.out.println("Water Bill Amount: "+bill);
    }
}