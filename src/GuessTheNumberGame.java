import application.Game;
import application.GameInputCLI;
import application.GameOutputCLI;
import domain.GameInput;
import domain.GameOutput;
import domain.GameRules;

import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        final GameRules gameRules = new GameRules(10);
        final Random generator = new Random();
        final GameInput gameInput = new GameInputCLI();
        final GameOutput gameOutput = new GameOutputCLI();
        final Game game = new Game(gameRules, generator, gameInput, gameOutput);

        game.play();
    }
}
