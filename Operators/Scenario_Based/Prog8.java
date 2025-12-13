/*

Write a java Program to Calculate Total Cakes Made

*/

import java.util.Scanner;
public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cake_per_hour = sc.nextInt();
        int hours = sc.nextInt();
        int total_cakes = cake_per_hour * hours;
        System.out.println(total_cakes);
    }
}