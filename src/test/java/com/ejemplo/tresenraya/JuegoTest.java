package com.ejemplo.tresenraya;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    @Test
    void elPrimerTurnoDebeSerDeX() {
        Juego juego = new Juego();
        assertEquals("X", juego.obtenerJugadorActual());
    }

    @Test
    void despuesDeXDebeJugarMas() {
        Juego juego = new Juego();
        juego.jugar(0, 0); // juega X
        assertEquals("+", juego.obtenerJugadorActual());
    }

    @Test
    void despuesDeMasDebeJugarX() {
        Juego juego = new Juego();
        juego.jugar(0, 0); // X
        juego.jugar(1, 0); // +
        assertEquals("X", juego.obtenerJugadorActual());
    }
}
