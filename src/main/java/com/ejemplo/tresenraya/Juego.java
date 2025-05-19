package com.ejemplo.tresenraya;

public class Juego {
    public Tablero tablero; // Cambiado a público para el ejemplo
    private String jugadorActual;
    private String ganador;

    public Juego() {
        this.tablero = new Tablero();
        this.jugadorActual = "X";
        this.ganador = null;
    }

    public String obtenerJugadorActual() {
        return jugadorActual;
    }

    public void jugar(int x, int y) {
        if (ganador != null) {
            throw new IllegalStateException("El juego ya ha terminado");
        }
        
        tablero.colocarPieza(x, y, jugadorActual);
        
        if (tablero.hayGanador()) {
            ganador = jugadorActual;
        } else {
            jugadorActual = jugadorActual.equals("X") ? "+" : "X";
        }
    }

    public String obtenerGanador() {
        return ganador;
    }

    public boolean juegoTerminado() {
        return ganador != null;
    }
}
