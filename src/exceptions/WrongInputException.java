package exceptions;

public class WrongInputException extends NumberFormatException {
    private final String input;

    public WrongInputException(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
