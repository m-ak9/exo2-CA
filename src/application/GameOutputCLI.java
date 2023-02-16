package application;

import domain.GameOutput;

public class GameOutputCLI implements GameOutput {
    @Override
    public void printWelcomeMessage() {
        System.out.println("-===========================-");
        System.out.println("=== GUESS THE NUMBER GAME ===");
        System.out.println("-===========================-");

    }

    @Override
    public void printGameRules() {
        System.out.println("Guess the number (between 1 and 100)!");
    }

    @Override
    public void printWinMessage(int attempts) {
        System.out.println("You found it after " + attempts + " tries!");
    }

    @Override
    public void printBadAnswer(boolean isSmaller, int attempts, int maxAttempts) {
        String divergence = isSmaller ? "smaller" : "greater";
        System.out.println("Wrong! Your number is " + divergence + " than the correct one. " + (maxAttempts - attempts) + "/" + maxAttempts + " tries left");
    }

    @Override
    public void printBadInput(String input, int attempts, int maxAttempts) {
        System.out.println("Your input was '" + input + "', please enter a valid integer. " + (maxAttempts - attempts) + "/" + maxAttempts + " tries left");
    }

    @Override
    public void printLooseMessage(int maxAttempts, int numberToGuess) {
        System.out.println("You lose after " + maxAttempts + " tries, the expected number was " + numberToGuess);
    }

    @Override
    public void printTryAgainMessage() {
        System.out.println("----------------------------------------------------");
        System.out.println("Do you want to try again with a new number (yes/no)?");
    }

    @Override
    public void printThanksForPlayingMessage() {
        System.out.println("== Thanks for playing! ==");

    }

    @Override
    public void printDebugMessage(int numberToGuess) {
        System.out.println("debug : the expected number is " + numberToGuess);
    }
}
