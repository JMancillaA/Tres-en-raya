package com.ejemplo.tresenraya;

public class Board {
    private final String[][] grid = new String[3][3];

    public void placePiece(int x, int y, String piece) {
        if (x < 0 || x >= 3) {
            throw new IllegalArgumentException("Coordenada X fuera de rango");
        }
        if (y < 0 || y >= 3) {
            throw new IllegalArgumentException("Coordenada Y fuera de rango");
        }
        if (grid[x][y] != null) {
            throw new IllegalStateException("El espacio ya está ocupado");
        }
        grid[x][y] = piece;
    }

    public String getPiece(int x, int y) {
        return grid[x][y];
    }
}
