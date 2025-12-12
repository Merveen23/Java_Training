/*

Write a java Program to Convert Bytes to bits

*/

import java.util.Scanner;
public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bytes = sc.nextDouble();
        double bits = bytes * 8;
        System.out.println(bits);
    }
}