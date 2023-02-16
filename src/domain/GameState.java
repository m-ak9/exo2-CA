package domain;

public class GameState {

    private int userGuess;
    private int actualAttempts;
    private boolean continuePlaying;
    private int numberToGuess;

    public GameState(int numberToGuess) {
        this.numberToGuess = numberToGuess;
        this.userGuess = 0;
        this.actualAttempts = 0;
        this.continuePlaying = true;
    }

    public int getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }

    public int getActualAttempts() {
        return actualAttempts;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public void setActualAttempts(int actualAttempts) {
        this.actualAttempts = actualAttempts;
    }

    public boolean isContinuePlaying() {
        return continuePlaying;
    }

    public void setContinuePlaying(boolean continuePlaying) {
        this.continuePlaying = continuePlaying;
    }

}
