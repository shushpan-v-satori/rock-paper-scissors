package com.nology;

public class CheckOutcome {

    int outcome[] = {0,0};
    public static int[] checkOutcome(String userInput , String machineInput, int[] outcome ) {
        userInput = userInput.toUpperCase();
        if (userInput.equals("ROCK")) {

            switch (machineInput){
                case "ROCK":
                    outcome[0]++;
                    outcome[1]++;
                    break;
                case "PAPER":
                    outcome[1]++;
                    break;

                case "SCISSORS":
                    outcome[0]++;
                    break;
            }

        } else if (userInput.equals("PAPER")) {
            switch (machineInput){
                case "ROCK":
                    outcome[0]++;
                    break;

                case "PAPER":
                    outcome[0]++;
                    outcome[1]++;
                    break;

                case "SCISSORS":
                    outcome[1]++;
                    break;
            }
        } else if (userInput.equals("SCISSORS")) {
            switch (machineInput){
                case "ROCK":
                    outcome[1]++;
                    break;

                case "PAPER":
                    outcome[0]++;
                    break;

                case "SCISSORS":
                    outcome[0]++;
                    outcome[1]++;
                    break;
            }

        }
        System.out.println("User " + outcome[0] + " : " + outcome[1] + " Machine");
        return outcome;
    };
}
