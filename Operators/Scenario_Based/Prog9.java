/*

Write a java Program to Calculate Simple Interest

*/

import java.util.Scanner;
public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double SI = (principle * rate * time) / 100;
        System.out.println(SI);
    }
}