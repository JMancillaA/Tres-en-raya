package com.ejemplo.tresenraya;

public class VisualizadorTablero {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();

        // Pruebas visuales manuales
        tablero.colocarPieza(0, 0); // X en esquina superior izquierda
        tablero.colocarPieza(1, 1); // X en centro
        tablero.colocarPieza(2, 2); // X en esquina inferior derecha

        tablero.imprimirTablero();
    }
}
