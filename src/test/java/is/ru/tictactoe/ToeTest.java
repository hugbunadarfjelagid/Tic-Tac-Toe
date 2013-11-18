package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToeTest {
	@Test
	public void greetResultsInToe() {
		Toe toe = new Toe();
		assertEquals("Tic Tac Toe", toe.greet());
	}
}
