/*

Write a Java Program using switch case to print the season based on month number.

*/

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        
        switch(month) {
            case 3: case 4: case 5: case 6:
                System.out.println("Summer");
                break;

            case 7: case 8: case 9: case 10:
                System.out.println("Rainy");
                break;

            case 11: case 12: case 1: case 2:
                System.out.println("Winter");
                break;    
                
            default:
                System.out.println("Wrong Input");    
        }
    }
}