package com.ejemplo.tresenraya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    void testXOutOfBoundsThrowsException() {
        Board board = new Board();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> board.placePiece(3, 1, "X"));
        assertEquals("Coordenada X fuera de rango", ex.getMessage());
    }

    @Test
    void testYOutOfBoundsThrowsException() {
        Board board = new Board();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> board.placePiece(0, -1, "O"));
        assertEquals("Coordenada Y fuera de rango", ex.getMessage());
    }

    @Test
    void testOccupiedSpaceThrowsException() {
        Board board = new Board();
        board.placePiece(1, 1, "X");
        Exception ex = assertThrows(IllegalStateException.class, () -> board.placePiece(1, 1, "O"));
        assertEquals("El espacio ya está ocupado", ex.getMessage());
    }
}
