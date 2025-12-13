/*

Write a java Program to calculate Salary of Employee

*/

import java.util.Scanner;
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double ta = basic * 0.05;
        double salary = basic + hra + da + ta; 
        System.out.println(hra);
        System.out.println(da);
        System.out.println(ta);
        System.out.println(salary);
    }
}