/*

Write a Java Program to print two words in double quotes.

*/

import java.util.Scanner;
public class Prog17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("\""+str1+" "+str2+"\"");
    }
}