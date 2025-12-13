/*

Write a java Program to Distribute Candies Equally Among People

*/

import java.util.Scanner;
public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int people = sc.nextInt();
        int candies_per_person = candies / people;
        int remaining = candies & people;
        System.out.println(candies_per_person);
        System.out.println(remaining);
    }
}