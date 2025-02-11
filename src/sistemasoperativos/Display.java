
import java.util.HashSet;
import java.util.Scanner;

public class Display {
    WordleBoard board;
    Scanner input;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public Display(WordleBoard board, Scanner input) {
        this.board = board;
        this.input = input;
    }

    // Prints out the board
    // Prints out previous guesses and remaining attempts
    public void print() {
        printGuesses();
        printBlanks();
        clear();
    }

    // Clears the terminal
    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Prompts user to type in a guess from the terminal
    // Will only take in words of an appropriate length
    public String promptGuess() {
        while (true) {
            System.out.println("Enter a word:");
            String guess = input.nextLine().toUpperCase();
            if (guess.length() != board.getWord().length()) {
                System.out.println("Please enter word of length " + board.getWord().length());
            } else {
                board.guess(guess);
                return guess;
            }
        }
    }

    // Prints out previous guesses on the board with appropriate feedback
    // Prints out characters of the guesses seperated by "|"
    public void printGuesses() {

        StringBuilder b = new StringBuilder();
        for (String s : board.guesses) {

            for (int i = 0; i < s.length(); i++) {
                String answer = board.getWord();
                char c = s.charAt(i);

                // letter is in correct place
                if (answer.charAt(i) == c) {
                    b.append(ANSI_GREEN + c + ANSI_RESET);
                // letter is contained in answer
                } else if (answer.contains(Character.toString(c))) {
                    b.append(ANSI_YELLOW + c + ANSI_RESET);
                } else {
                    b.append(c);
                }
                b.append("|");
            }

            b.setLength((b.length() - 1));
            System.out.println(b.toString());
            b = new StringBuilder();
        }
    }

    // prints out spaces for remaining attempts
    public void printBlanks() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < board.getAttemptsRemaining(); i++) {
            for (int j = 0; j < board.getWord().length(); j++) {
                b.append("_|");
            }
            b.setLength(b.length() - 1);
            System.out.println(b.toString());
            b = new StringBuilder();
        }
    }
    // Método para imprimir el tablero de letras disponibles
    public void printLettersBoard(HashSet<Character> availableLetters) {
        System.out.println("Available Letters:");
        for (char c = 'A'; c <= 'Z'; c++) {
            if (availableLetters.contains(c)) {
                System.out.print(c + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
}