/*

Write a Java Program to check grade of a student based on marks (A, B, C, Fail).

*/

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        switch (marks / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("A Grade");
                break;

            case 7:
            case 6:
            case 5:
                System.out.println("B Grade");
                break;

            case 4:
            case 3:
                System.out.println("C Grade");
                break;

            default:
                System.out.println("Fail");
        }
    }
}
