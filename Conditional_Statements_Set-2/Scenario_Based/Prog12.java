/*

Write a java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.

*/

import java.util.Scanner;
public class Prog12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if(temperature>=0 && temperature<=5)
            System.out.println("Cold");
        else if(temperature>5 && temperature<=15)
            System.out.println("Pleasent");
        else if(temperature>15 && temperature<=40)
            System.out.println("Hot");
        else
            System.out.println("HeatWave");
    }
}