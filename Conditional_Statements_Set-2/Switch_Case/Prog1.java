/*

Write a Java Program for an arithmetic calculator using switch case.

*/

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                if (num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("Division by Zero not Allowed");
                break; 

            default:
                System.out.println("Invalid Operator");
        }
    }
}
