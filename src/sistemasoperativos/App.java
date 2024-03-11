import java.util.Scanner;

public class App {
    // Método que contiene la lógica del juego
    public void playWordle() {
        String[] words = { "WHICH", "THERE", "THEIR", "ABOUT", "WOULD", "THESE", "OTHER", "WORDS", "COULD", "WRITE",
				"FIRST", "WATER", "AFTER", "WHERE", "RIGHT", "THINK", "THREE", "YEARS", "PLACE", "SOUND", "GREAT",
				"AGAIN", "STILL", "EVERY", "SMALL", "FOUND", "THOSE", "NEVER", "UNDER", "MIGHT", "WHILE", "HOUSE",
				"WORLD", "BELOW", "ASKED", "GOING", "LARGE", "UNTIL", "ALONG", "SHALL", "BEING", "OFTEN", "EARTH",
				"BEGAN", "SINCE", "STUDY", "NIGHT", "LIGHT", "ABOVE", "PAPER", "PARTS", "YOUNG", "STORY", "POINT",
				"TIMES", "HEARD", "WHOLE", "WHITE", "GIVEN", "MEANS", "MUSIC", "MILES", "THING", "TODAY", "LATER",
				"USING", "MONEY", "LINES", "ORDER", "GROUP", "AMONG", "LEARN", "KNOWN", "SPACE", "TABLE", "EARLY",
				"TREES", "SHORT", "HANDS", "STATE", "BLACK", "SHOWN", "STOOD", "FRONT", "VOICE", "KINDS", "MAKES",
				"COMES", "CLOSE", "POWER", "LIVED", "VOWEL", "TAKEN", "BUILT", "HEART", "READY", "QUITE", "CLASS",
				"BRING", "ROUND", "HORSE", "SHOWS", "PIECE", "GREEN", "STAND", "BIRDS", "START", "RIVER", "TRIED",
				"LEAST", "FIELD", "WHOSE", "GIRLS", "LEAVE", "ADDED", "COLOR", "THIRD", "HOURS", "MOVED", "PLANT",
				"DOING", "NAMES", "FORMS", "HEAVY", "IDEAS", "CRIED", "CHECK", "FLOOR", "BEGIN", "WOMAN", "ALONE",
				"PLANE", "SPELL", "WATCH", "CARRY", "WROTE", "CLEAR", "NAMED", "BOOKS", "CHILD", "GLASS", "HUMAN",
				"TAKES", "PARTY", "BUILD", "SEEMS", "BLOOD", "SIDES", "SEVEN", "MOUTH", "SOLVE", "NORTH", "VALUE",
				"DEATH", "MAYBE", "HAPPY", "TELLS", "GIVES", "LOOKS", "SHAPE", "LIVES", "STEPS", "AREAS", "SENSE",
				"SPEAK", "FORCE", "OCEAN", "SPEED", "WOMEN", "METAL", "SOUTH", "GRASS", "SCALE", "CELLS", "LOWER",
				"SLEEP", "WRONG", "PAGES", "SHIPS", "NEEDS", "ROCKS", "EIGHT", "MAJOR", "LEVEL", "TOTAL", "AHEAD",
				"REACH", "STARS", "STORE", "SIGHT", "TERMS", "CATCH", "WORKS", "BOARD", "COVER", "SONGS", "EQUAL",
				"STONE", "WAVES", "GUESS", "DANCE", "SPOKE", "BREAK", "CAUSE", "RADIO", "WEEKS", "LANDS", "BASIC",
				"LIKED", "TRADE", "FRESH", "FINAL", "FIGHT", "MEANT", "DRIVE", "SPENT", "LOCAL", "WAXES", "KNOWS",
				"TRAIN", "BREAD", "HOMES", "TEETH", "COAST", "THICK", "BROWN", "CLEAN", "QUIET", "SUGAR", "FACTS",
				"STEEL", "FORTH", "RULES", "NOTES", "UNITS", "PEACE", "MONTH", "VERBS", "SEEDS", "HELPS", "SHARP",
				"VISIT", "WOODS", "CHIEF", "WALLS", "CROSS", "WINGS", "GROWN", "CASES", "FOODS", "CROPS", "FRUIT",
				"STICK", "WANTS", "STAGE", "SHEEP", "NOUNS", "PLAIN", "DRINK", "BONES", "APART", "TURNS", "MOVES",
				"TOUCH", "ANGLE", "BASED", "RANGE", "MARKS", "TIRED", "OLDER", "FARMS", "SPEND", "SHOES", "GOODS",
				"CHAIR", "TWICE", "CENTS", "EMPTY", "ALIKE", "STYLE", "BROKE", "PAIRS", "COUNT", "ENJOY", "SCORE",
				"SHORE", "ROOTS", "PAINT", "HEADS", "SHOOK", "SERVE", "ANGRY", "CROWD", "WHEEL", "QUICK", "DRESS",
				"SHARE", "ALIVE", "NOISE", "SOLID", "CLOTH", "SIGNS", "HILLS", "TYPES", "DRAWN", "WORTH", "TRUCK",
				"PIANO", "UPPER", "LOVED", "USUAL", "FACES", "DROVE", "CABIN", "BOATS", "TOWNS", "PROUD", "COURT",
				"MODEL", "PRIME", "FIFTY", "PLANS", "YARDS", "PROVE", "TOOLS", "PRICE", "SHEET", "SMELL", "BOXES",
				"RAISE", "MATCH", "TRUTH", "ROADS" };
        
        WordleBoard board = new WordleBoard(words);
        Scanner input = new Scanner(System.in);
        AvailableLetters availableLetters = new AvailableLetters();
        Display display = new Display(board, input);

        while (!board.isGameOver()) {
            display.print();
            display.printLettersBoard(availableLetters.getAvailableLetters());
            String guess = display.promptGuess();
            availableLetters.removeLetters(guess);
        }

        display.print();

        if (board.didWin()) {
            System.out.println("Congratulations, you guessed correctly");
        } else {
            System.out.println("Sorry, you did not guess correctly");
        }

        System.out.println("The answer was " + board.getWord());
        input.close();
    }

    public static void main(String[] args) {
        // Llama al método playWordle() para iniciar el juego
        App app = new App();
        app.playWordle();
    }
}