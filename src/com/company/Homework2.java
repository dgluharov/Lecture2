package com.company;

import java.util.Scanner;

public class Homework2 {
    /*Task 2 -  A student will not be allowed to sit in exam if his/her attendance is less than 75%. Take following input from user :
                       Number of classes held
                       Number of classes attended
                       And print percentage of class attended and if the student is allowed to sit in exam or not*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number of classes held");
        double numberOfClassesHeld = scanner.nextInt();
        System.out.println("Please, enter a number of classes attended");
        double numberOfClassesAttended = scanner.nextInt();

        int percentage = (int) Math.round(numberOfClassesAttended / numberOfClassesHeld * 100);

        if (percentage < 75) {
            System.out.println(percentage + "%");
            System.out.println("You are not able to attend");
        } else {
            System.out.println(percentage + "%");
            System.out.println("You are able to attend");
        }
        scanner.close();
    }
}
