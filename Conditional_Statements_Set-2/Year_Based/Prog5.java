/*

Write a Java Program to check whether a given year and month combination is valid and print the number of days in that month.

*/

import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int days = 0;
        boolean valid = true;

        if(year<=0 || month<1 || month>12)
            valid = false;
        else {
            switch(month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

                case 4: case 6: case 9: case 11:
                days = 30;
                break;

                case 2:
                    if(year%400==0 || year%4==0 && year%100!=0)
                        days = 29;
                    else
                        days = 28;
                    break;
            }
        }
        if(valid)
            System.out.println("Valid Year and Month with days: "+days);
        else
            System.out.println("Invalid year or Month");
    }
}