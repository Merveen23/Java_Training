/*

Write a Java Program to print your marks in 5 subjects each on a new line.

*/

import java.util.Scanner;
public class Prog22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub1 = sc.nextLine();
        String sub2 = sc.nextLine();
        String sub3 = sc.nextLine();
        String sub4 = sc.nextLine();
        String sub5 = sc.nextLine();
        System.out.println("English: "+sub1);
        System.out.println("Science: "+sub2);
        System.out.println("Social: "+sub3);
        System.out.println("Maths: "+sub4);
        System.out.println("Computer Science: "+sub5);
    }
}