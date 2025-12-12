/*

Write a java Program to calculate cost price given selling price and loss.

*/

import java.util.Scanner;
public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sp = sc.nextDouble();
        double loss = sc.nextDouble();
        double cp = sp + loss;
        System.out.println(cp);
    }
}
