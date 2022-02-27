package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Homework4 {
    /*Get a random number between 1 and 100
      Check if the number is odd or even
      Print the information on the console*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        System.out.println("The random number is " + number);

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }
    }
}
