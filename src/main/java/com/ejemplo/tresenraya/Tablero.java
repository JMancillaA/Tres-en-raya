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

}
