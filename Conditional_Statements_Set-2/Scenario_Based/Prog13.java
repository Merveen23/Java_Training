/*

Write a java program to display mobile battery status (full, moderate, low).

*/

import java.util.Scanner;
public class Prog13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if(battery>=90 && battery<=100)
            System.out.println("Full");
        else if(battery>=50 && battery<90)
            System.out.println("Moderate");
        else
            System.out.println("Low");
    }
}