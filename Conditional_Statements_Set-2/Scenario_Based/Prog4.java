/*

Write a java program to display mobile Battery Check – "Low Battery", "50% Consumed", or "Battery Full".

*/

import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if(battery>=90 && battery<=100)
            System.out.println("Battery full");
        else if(battery>=50 && battery<90)
            System.out.println("50% Consumed");
        else
            System.out.println("Low Battery");
    }
}