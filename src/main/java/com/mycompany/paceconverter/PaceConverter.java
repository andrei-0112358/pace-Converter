/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paceconverter;

import java.util.Scanner;

public class PaceConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice;

        // Loop until valid choice is entered
        while (true) {
            System.out.print("Do you want to convert miles or kilometers? Enter M for miles, K for kilometers: ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("M") || choice.equals("K")) {
                break; // valid choice
            } else {
                System.out.println("Invalid input! Please enter M or K.");
            }
        }

        // Ask user for pace
        System.out.print("Enter your pace in mm:ss format (e.g., 4:30): ");
        String input = scanner.nextLine();
        String[] parts = input.split(":");

        if (parts.length != 2) {
            System.out.println("Invalid format! Use mm:ss");
            return;
        }

        try {
            int minutes = Integer.parseInt(parts[0]);
            int seconds = Integer.parseInt(parts[1]);

            if (seconds < 0 || seconds >= 60) {
                System.out.println("Seconds must be between 0 and 59");
                return;
            }

            int totalSeconds = minutes * 60 + seconds;

            double convertedSeconds;
            String resultLabel;

            if (choice.equals("K")) {
                // Convert km pace to mile pace
                convertedSeconds = totalSeconds * 1.60934;
                resultLabel = "Pace per mile";
            } else {
                // Convert mile pace to km pace
                convertedSeconds = totalSeconds / 1.60934;
                resultLabel = "Pace per km";
            }

            int convertedMinutes = (int) convertedSeconds / 60;
            int convertedSec = (int) Math.round(convertedSeconds % 60);

            System.out.printf("%s: %d:%02d%n", resultLabel, convertedMinutes, convertedSec);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Use mm:ss format.");
        }

        scanner.close();
    }
}