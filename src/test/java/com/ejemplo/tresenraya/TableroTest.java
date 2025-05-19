package com.ejemplo.tresenraya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    @Test
    void lanzarExcepcionSiXFueraDelTablero() {
        Tablero tablero = new Tablero();
        assertThrows(IllegalArgumentException.class, () -> tablero.colocarPieza(3, 1));
    }

    @Test
    void lanzarExcepcionSiYFueraDelTablero() {
        Tablero tablero = new Tablero();
        assertThrows(IllegalArgumentException.class, () -> tablero.colocarPieza(1, 3));
    }

    @Test
    void lanzarExcepcionSiPosicionYaOcupada() {
        Tablero tablero = new Tablero();
        tablero.colocarPieza(1, 1);
        assertThrows(IllegalArgumentException.class, () -> tablero.colocarPieza(1, 1));
    }
}
