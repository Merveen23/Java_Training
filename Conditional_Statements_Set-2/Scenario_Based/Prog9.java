/*

Write a java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).

*/

import java.util.Scanner;
public class Prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        double balance = 10000;
        if(amount > 0 && amount <= balance && amount%100==0) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining balance: "+balance);
        }    
        else
            System.out.println("Invalid Amount or Insufficient Balance");
    }
}