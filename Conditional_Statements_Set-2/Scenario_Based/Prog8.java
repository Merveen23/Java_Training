/*

Write a java program to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.

*/

import java.util.Scanner;
public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        int code = 5648;
        if(pin==code)
            System.out.println("PIN Successful");
        else
            System.out.println("PIN Unsuccessful");
    }
}