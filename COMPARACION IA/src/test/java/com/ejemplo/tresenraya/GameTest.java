package test.java.com.ejemplo.tresenraya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    void testNoWinnerAtStart() {
        Game game = new Game();
        assertNull(game.getWinner());
    }

    @Test
    void testHorizontalWin() {
        Game game = new Game();
        game.makeMove(0, 0); // X
        game.makeMove(1, 0); // +
        game.makeMove(0, 1); // X
        game.makeMove(1, 1); // +
        game.makeMove(0, 2); // X wins
        assertEquals("X", game.getWinner());
    }

    @Test
    void testVerticalWin() {
        Game game = new Game();
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // +
        game.makeMove(1, 0); // X
        game.makeMove(1, 1); // +
        game.makeMove(2, 0); // X wins
        assertEquals("X", game.getWinner());
    }

    @Test
    void testDiagonalWinMain() {
        Game game = new Game();
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // +
        game.makeMove(1, 1); // X
        game.makeMove(0, 2); // +
        game.makeMove(2, 2); // X wins
        assertEquals("X", game.getWinner());
    }

    @Test
    void testDiagonalWinAnti() {
        Game game = new Game();
        game.makeMove(0, 2); // X
        game.makeMove(0, 0); // +
        game.makeMove(1, 1); // X
        game.makeMove(1, 0); // +
        game.makeMove(2, 0); // X no gana aún
        game.makeMove(2, 0); // movimiento inválido (ya ocupado)
        game.makeMove(2, 0); // +
        assertNotEquals("X", game.getWinner());
    }

    @Test
    void testNoWin() {
        Game game = new Game();
        game.makeMove(0, 0); // X
        game.makeMove(0, 1); // +
        game.makeMove(1, 0); // X
        game.makeMove(1, 1); // +
        game.makeMove(2, 1); // X
        assertNull(game.getWinner());
    }
}
