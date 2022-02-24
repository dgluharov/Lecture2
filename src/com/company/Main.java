package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(-100, 100 + 1);

        if (randomNumber < 0) {
            System.out.println("The number " + randomNumber + " is negative");
        } else {
            System.out.println("The number " + randomNumber + " is positive");
        }

        String theNumberIs = (randomNumber < 0) ? "The number " + randomNumber + " is negative" : "The number " + randomNumber + " is positive";

        System.out.println(theNumberIs);


        Scanner scanner = new Scanner(System.in);

        int grade = scanner.nextInt();

        if (grade == 6) {
            System.out.println("Your grade is Excellent");
        } else if (grade == 5) {
            System.out.println("Your grade is Very good");
        } else if (grade == 4) {
            System.out.println("Your grade is Good");
        } else if (grade == 3) {
            System.out.println("Your grade is Average");
        } else {
            System.out.println("Your grade is Poor");
        }

        int grade2 = scanner.nextInt();
        switch (grade2) {
            case 2:
                System.out.println("Your grade is Poor");
                break;
            case 3:
                System.out.println("Your grade is Average");
                break;
            case 4:
                System.out.println("Your grade is Good");
                break;
            case 5:
                System.out.println("Your grade is Very good");
                break;
            case 6:
                System.out.println("Your grade is Excellent");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        scanner.close();
    }
}
