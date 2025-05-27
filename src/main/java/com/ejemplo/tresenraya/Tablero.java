package com.ejemplo.tresenraya;

public class Tablero {
    private String[][] tablero = new String[3][3];

    public void colocarPieza(int x, int y) {
        if (x < 0 || x >= 3) {
            throw new IllegalArgumentException("Coordenada X fuera del tablero");
        }
        if (y < 0 || y >= 3) {
            throw new IllegalArgumentException("Coordenada Y fuera del tablero");
        }
        if (tablero[x][y] != null) {
            throw new IllegalArgumentException("Ya hay una pieza en esa posición");
        }

        tablero[x][y] = "X"; // solo para fines de prueba
    }

    public void colocarPieza(int x, int y, String jugador) {
        if (x < 0 || x >= 3) {
            throw new IllegalArgumentException("Coordenada X fuera del tablero");
        }
        if (y < 0 || y >= 3) {
            throw new IllegalArgumentException("Coordenada Y fuera del tablero");
        }
        if (tablero[x][y] != null) {
            throw new IllegalArgumentException("Ya hay una pieza en esa posición");
        }

        tablero[x][y] = jugador;
    }

    public void imprimirTablero() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(tablero[x][y] == null ? "-" : tablero[x][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean hayGanador() {
        return  verificarVerticales() || verificarDiagonales();
    }

    private boolean verificarHorizontales() {
        for (int y = 0; y < 3; y++) {
            if (tablero[0][y] != null && 
                tablero[0][y].equals(tablero[1][y]) && 
                tablero[0][y].equals(tablero[2][y])) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarVerticales() {
        for (int x = 0; x < 3; x++) {
            if (tablero[x][0] != null && 
                tablero[x][0].equals(tablero[x][1]) && 
                tablero[x][0].equals(tablero[x][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarDiagonales() {
        // Diagonal principal
        if (tablero[0][0] != null && 
            tablero[0][0].equals(tablero[1][1]) && 
            tablero[0][0].equals(tablero[2][2])) {
            return true;
        }
        // Diagonal secundaria
        if (tablero[2][0] != null && 
            tablero[2][0].equals(tablero[1][1]) && 
            tablero[2][0].equals(tablero[0][2])) {
            return true;
        }
        return false;
    }
}
