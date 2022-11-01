package com.nology;

import java.util.Random;

public class PossibleMoves {
    //possible options
    public enum Choices{
        ROCK,
        PAPER,
        SCISSORS
    };
    // randomise machine output
    private static final Random RandomChoices = new Random();
    public static String randomDirection() {
        Choices[] choices = Choices.values();
        return String.valueOf(choices[RandomChoices.nextInt(choices.length)]);
    }
}
