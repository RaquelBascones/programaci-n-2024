import java.util.HashSet;

public class AvailableLetters {
	private HashSet<Character> availableLetters;

	public AvailableLetters() {
		availableLetters = generateAvailableLetters();
	}

	private HashSet<Character> generateAvailableLetters() {
		HashSet<Character> letters = new HashSet<>();
		for (char c = 'A'; c <= 'Z'; c++) {
			letters.add(c);
		}
		return letters;
	}

	public void removeLetters(String guess) {
		for (char c : guess.toCharArray()) {
			availableLetters.remove(c);
		}
	}

	public HashSet<Character> getAvailableLetters() {
		return availableLetters;
	}
}