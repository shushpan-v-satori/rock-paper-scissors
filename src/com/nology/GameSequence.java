package com.nology;

import static com.nology.PossibleMoves.randomDirection;
import static com.nology.UserInput.getUserInput;

public class GameSequence {
    public static String[] runTheGame() {
        String[] inputsArr = new String[2];
        inputsArr[0] = getUserInput();
        System.out.println("Me shoot now...Muahahaha!");
        inputsArr[1] = randomDirection();
        System.out.println(inputsArr[1]);
        return inputsArr;
    }
}
