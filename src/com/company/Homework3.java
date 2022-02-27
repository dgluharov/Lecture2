package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a day");
        int day = scanner.nextInt();
        System.out.println("Please, enter a month");
        int month = scanner.nextInt();
        System.out.println("Please, enter a year");
        int year = scanner.nextInt();

        String incorrectMessage = "Not a valid date";
        String correctMessage = "Valid date";

        if (day <= 0 || month <= 0 || year <= 0) {
            System.out.println(incorrectMessage);
            return;
        }

        if (day > 31 || month > 12) {
            System.out.println(incorrectMessage);
            return;
        }

        if (year % 4 == 0) {
            if (month == 2) {
                if (day > 29) {
                    System.out.println(incorrectMessage);
                    return;
                }
            }
        } else if (month == 2) {
            if (day > 28) {
                System.out.println(incorrectMessage);
                return;
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                System.out.println(incorrectMessage);
                return;
            }
        } else {
            System.out.println(correctMessage);
        }
        scanner.close();
    }
}
