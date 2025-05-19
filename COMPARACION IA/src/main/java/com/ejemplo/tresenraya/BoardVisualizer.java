package main.java.com.ejemplo.tresenraya;

import java.util.Scanner;

public class BoardVisualizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        
        System.out.println("¡Bienvenido al juego Tres en Raya!");
        System.out.println("Para jugar, ingresa las coordenadas (0-2) cuando sea tu turno.");
        
        while (game.getWinner() == null) {
            System.out.println("\nEstado actual del tablero:");
            game.getBoard().printBoard();
            System.out.println("Turno del jugador: " + game.getCurrentPlayer());
            
            try {
                System.out.print("Ingresa coordenada X (0-2): ");
                int x = scanner.nextInt();
                System.out.print("Ingresa coordenada Y (0-2): ");
                int y = scanner.nextInt();
                
                game.makeMove(x, y);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Por favor, intenta de nuevo.");
            } catch (Exception e) {
                System.out.println("Entrada inválida. Usa números del 0 al 2.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        
        System.out.println("\nEstado final del tablero:");
        game.getBoard().printBoard();
        System.out.println("¡El juego ha terminado!");
        System.out.println("Ganador: " + game.getWinner());
        
        scanner.close();
    }
}
