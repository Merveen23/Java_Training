/*

Write a java program to assign different ticket prices based on day of the week (weekday/weekend).

*/

import java.util.Scanner;
public class Prog17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int price;
        switch(day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thurday":
            case "friday":
                price = 100;
                System.out.println("Weekday Ticket price: "+price);   
                break;
                
            case "saturday":
            case "sunday":
                price = 150;
                System.out.println("Weekend Ticket price: "+price);    
                break;
                
            default:
                System.out.println("Invalid Day");    
        }
    }
}