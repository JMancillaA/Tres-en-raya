package main.java.com.ejemplo.tresenraya;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.makeMove(0, 0); // X
        BoardVisualizer.print(game.getBoard());
        game.makeMove(1, 1); // +
        BoardVisualizer.print(game.getBoard());
        game.makeMove(0, 1); // X
        BoardVisualizer.print(game.getBoard());
    }
}
