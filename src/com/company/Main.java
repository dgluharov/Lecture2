package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNumber = ThreadLocalRandom.current().nextInt(-100, 100 + 1);

        System.out.println("The random number is:" + randomNumber);

        if (randomNumber < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }
}
