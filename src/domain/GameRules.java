package domain;

public class GameRules {

    private final int maxAttempts;


    public GameRules(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}
