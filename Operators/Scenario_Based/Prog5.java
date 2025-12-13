/*

Write a java Program to Convert Kilometers to Meters

*/

import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double meters = kilometers * 1000;
        System.out.println(meters);
    }
}