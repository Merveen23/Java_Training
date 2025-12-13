/*

Write a java program to assign ticket price based on passenger age (child, adult, senior).

*/

import java.util.Scanner;
public class Prog14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18)
            System.out.println("Child: 40 Rs");
        else if(age>=18 && age<60)
            System.out.println("Adult: 100 Rs");
        else
            System.out.println("Senior: 110 Rs");
    }
}