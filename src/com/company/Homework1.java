package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*Task 1 - Write a program to print absolute value of a number entered by user.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Absolute value of your number is: " + number);
        } else {
            number *= -1;
            System.out.println("Absolute value of your number is: " + number);
        }
    }
}


