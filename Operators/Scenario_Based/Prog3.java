/*

Write a java Program to Split the Bill Among 3 Friends

*/

import java.util.Scanner;
public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double per_person = bill/3;
        System.out.println(per_person);
    }
}