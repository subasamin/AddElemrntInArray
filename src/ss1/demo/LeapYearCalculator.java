package ss1.demo;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year: ");
        int year = scanner.nextInt();

        if (year%4 == 0 && year%100 != 0){
            System.out.println("Leap year");
        }
        else if (year%100 == 0 && year%400 != 0){
            System.out.println("No Leap year");
        }
        else if (year%100 == 0 && year%400 == 0){
            System.out.println("Leap year");
        }
    }
}
