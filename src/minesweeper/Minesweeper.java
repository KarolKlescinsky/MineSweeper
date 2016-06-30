package minesweeper;

import minesweeper.consoleui.ConsoleUI;
import minesweeper.consoleui.UserInterface;
import minesweeper.core.Field;

/**
 * Main application class.
 */
public class Minesweeper {
	/** User interface. */
	private UserInterface userInterface;
	private long startMillis = System.currentTimeMillis();
    private BestTimes bestTimes=new BestTimes();
    private static Minesweeper instance;

	/**
	 * Constructor.
	 */
	
	public int getPlayingSeconds(){
	
		int timePlayed= (int) (System.currentTimeMillis() - startMillis);
		
		return timePlayed;
		
	}
	
	private Minesweeper() {
		userInterface = new ConsoleUI();

		Field field = new Field(9, 9, 10);
		userInterface.newGameStarted(field);
	}

	public BestTimes getBestTimes() {
		return bestTimes;
	}


	/**
	 * Main method.
	 * 
	 * @param args
	 *            arguments
	 */
	public static void main(String[] args) {
		new Minesweeper();
	}
}
