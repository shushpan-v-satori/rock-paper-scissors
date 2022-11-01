package com.nology;

import java.util.Scanner;

public class UserInput {
    // take in user input
    public static  String getUserInput() {
        boolean isCorrectEntry = false;
        String userInput = null;
        while (!isCorrectEntry) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Shoot ...");
            userInput = inputScanner.nextLine();
            for (PossibleMoves.Choices choice : PossibleMoves.Choices.values()) {
                if (userInput.equalsIgnoreCase(choice.name())) {
                    isCorrectEntry = true;
                    System.out.println("great");
                    break;
                }
            }
            if (!isCorrectEntry) {
                System.out.println("Wrong move, try again...");
            }
        };
        return userInput;
    }
}
