/*

Write a Java Program to print your roll number and name in the format: Roll No: 123, Name: John

*/

import java.util.Scanner;
public class Prog21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Roll No: "+str1);
        System.out.println("Name: "+str2);
    }
}