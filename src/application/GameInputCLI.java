package application;

import domain.GameInput;
import exceptions.WrongInputException;

import java.util.Scanner;

public class GameInputCLI implements GameInput {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public int getUserGuess() {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new WrongInputException(input);
        }
    }

    @Override
    public boolean isContinuePlaying() {
        return scanner.nextLine().trim().toLowerCase().equals("yes");
    }
}
