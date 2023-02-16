package domain;

public interface GameOutput {

    void printWelcomeMessage();

    void printGameRules();

    void printWinMessage(int attempts);

    void printBadAnswer(boolean isSmaller, int attempts, int maxAttempts);

    void printBadInput(String input, int attempts, int maxAttempts);

    void printLooseMessage(int maxAttempts, int numberToGuess);


    void printTryAgainMessage();

    void printThanksForPlayingMessage();

    void printDebugMessage(int numberToGuess);
}
