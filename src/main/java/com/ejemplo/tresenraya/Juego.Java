package com.ejemplo.tresenraya;

public class Juego {
    private Tablero tablero;
    private String jugadorActual;

    public Juego() {
        this.tablero = new Tablero();
        this.jugadorActual = "X";
    }

    public String obtenerJugadorActual() {
        return jugadorActual;
    }

    public void jugar(int x, int y) {
        tablero.colocarPieza(x, y, jugadorActual);
        jugadorActual = jugadorActual.equals("X") ? "+" : "X";
    }
}
