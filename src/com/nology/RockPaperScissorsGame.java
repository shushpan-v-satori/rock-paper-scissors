package com.nology;

import static com.nology.CheckOutcome.*;
import static com.nology.GameSequence.*;



public class RockPaperScissorsGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock Paper Scissors Game");
        System.out.println("You have a choice of Rock Paper and Scissors");
        int outcome[] = {0,0};
        String[] inputsArr = new String[2];

        // game option with 3 tries
    for (int i=0 ; i<3 ; i++) {
        inputsArr = runTheGame();
        outcome = checkOutcome(inputsArr[0], inputsArr[1], outcome);
    }

    // game option - who gets 3 points first wins
    while(outcome[0]<3 && outcome[1]<3) {
        inputsArr = runTheGame();
        outcome = checkOutcome(inputsArr[0], inputsArr[1],  outcome);
    }
        //winning message
    if (outcome[0]>outcome[1]) {
            System.out.println("You won!!! Congratulations, but we will meet again!");
        } else if (outcome[0]==outcome[1]) {
        System.out.println("It is a tie, but we will meet again!");
    } else {
            System.out.println("Me won!!!");
        };
    }
}