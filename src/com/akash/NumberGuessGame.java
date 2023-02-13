package com.akash;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guess Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            guess = scan.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > target) {
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scan.close();
    }
}
