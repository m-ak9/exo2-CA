package application;

import domain.GameInput;
import domain.GameOutput;
import domain.GameRules;
import domain.GameState;
import exceptions.WrongInputException;

import java.util.Random;

public class Game {
    private final GameRules gameRules;
    private final GameState gameState;
    private final Random generator;
    private final GameInput gameInput;
    private final GameOutput gameOutput;

    public Game(GameRules gameRules, Random generator, GameInput gameInput, GameOutput gameOutput) {
        this.gameRules = gameRules;
        this.gameState = new GameState(generator.nextInt(100) + 1);
        this.generator = generator;
        this.gameInput = gameInput;
        this.gameOutput = gameOutput;
    }

    public void play() {
        gameOutput.printWelcomeMessage();
        while (gameState.isContinuePlaying()) {
            gameOutput.printGameRules();
            gameOutput.printDebugMessage(gameState.getNumberToGuess());
            while (isGameEnded()) {
                try {
                    updateUserInput();
                    if (isGuessCorrect()) {
                        gameOutput.printWinMessage(gameState.getActualAttempts());
                    } else {
                        boolean isSmaller = gameState.getUserGuess() < gameState.getNumberToGuess();
                        gameOutput.printBadAnswer(isSmaller, gameState.getActualAttempts(), gameRules.getMaxAttempts());
                    }
                } catch (WrongInputException e) {
                    gameOutput.printBadInput(e.getInput(), gameState.getActualAttempts(), gameRules.getMaxAttempts());
                }
                if (isMaxAttemptsReached()) {
                    gameOutput.printLooseMessage(gameRules.getMaxAttempts(), gameState.getNumberToGuess());
                }


            }
            gameOutput.printTryAgainMessage();
            if (gameInput.isContinuePlaying()) {
                resetGame();
            } else {
                gameState.setContinuePlaying(false);
            }
            ;
        }
        gameOutput.printThanksForPlayingMessage();
    }

    private void resetGame() {
        gameState.setActualAttempts(0);
        gameState.setNumberToGuess(generator.nextInt(100) + 1);
    }

    private boolean isMaxAttemptsReached() {
        return gameState.getActualAttempts() == gameRules.getMaxAttempts();
    }

    private boolean isGuessCorrect() {
        return gameState.getUserGuess() == gameState.getNumberToGuess();
    }

    private void updateUserInput() {
        gameState.setActualAttempts(gameState.getActualAttempts() + 1);
        gameState.setUserGuess(gameInput.getUserGuess());
    }

    private boolean isGameEnded() {
        return gameState.getNumberToGuess() != gameState.getUserGuess() && gameState.getActualAttempts() < gameRules.getMaxAttempts();
    }


}
