/*

Write a java Program to calculate selling price given cost price and profit

*/

import java.util.Scanner;
public class Prog11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextDouble();
        double profit = sc.nextDouble();
        double sp = cp + profit;
        System.out.println(sp);
    }
}
