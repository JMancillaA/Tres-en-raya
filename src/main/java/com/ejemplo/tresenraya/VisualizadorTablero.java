package com.ejemplo.tresenraya;

import java.util.Scanner;

public class VisualizadorTablero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Juego juego = new Juego();

        System.out.println("════════════════════════════════════");
        System.out.println("        ¡Bienvenido al juego        ");
        System.out.println("           Tres en Raya! 🎲         ");
        System.out.println("════════════════════════════════════");
        System.out.println("Para jugar, ingresa las coordenadas (0-2) cuando sea tu turno.");
        System.out.println("────────────────────────────────────");

        while (!juego.juegoTerminado()) {
            System.out.println("\n🟦 Estado actual del tablero:");
            juego.tablero.imprimirTablero();
            System.out.println("────────────────────────────────────");
            String jugador = juego.obtenerJugadorActual();
            String emoji = jugador.equals("X") ? "❌" : "⭕";
            System.out.println("Turno del jugador: " + jugador + " " + emoji);
            System.out.println("────────────────────────────────────");

            try {
                System.out.print("👉 Ingresa coordenada X (0-2): ");
                int x = scanner.nextInt();
                System.out.print("👉 Ingresa coordenada Y (0-2): ");
                int y = scanner.nextInt();

                juego.jugar(x, y);
            } catch (IllegalArgumentException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
                System.out.println("Por favor, intenta de nuevo.");
            } catch (Exception e) {
                System.out.println("❌ Entrada inválida. Usa números del 0 al 2.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }

        System.out.println("\n🟩 Estado final del tablero:");
        juego.tablero.imprimirTablero();
        System.out.println("════════════════════════════════════");
        System.out.println("🏁 ¡El juego ha terminado!");
        String ganador = juego.obtenerGanador();
        if (ganador != null && !ganador.equals("Empate")) {
            String emojiGanador = ganador.equals("X") ? "🎉❌" : "🎉⭕";
            System.out.println("🏆 Ganador: " + ganador + " " + emojiGanador);
        } else {
            System.out.println("🤝 ¡Empate!");
        }
        System.out.println("════════════════════════════════════");

        scanner.close();
    }
}
