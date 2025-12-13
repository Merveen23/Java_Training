/*

Write a Java Program to check whether the given day number (1–7) is a weekday or weekend.

*/

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        
        switch(days) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekday");
                break;

            case 6: case 7:
                System.out.println("Weekend");
                break;
                
            default:
                System.out.println("Wrong Input");    
        }
    }
}
