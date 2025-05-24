package main.java.com.ejemplo.tresenraya;

public class Game {
    private final Board board;
    private String currentPlayer;
    private String winner;

    public Game() {
        this.board = new Board();
        this.currentPlayer = "X";
        this.winner = null;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public String getWinner() {
        return winner;
    }

    public void makeMove(int x, int y) {
        if (winner != null) {
            throw new IllegalStateException("El juego ya ha terminado");
        }

        board.placePiece(x, y, currentPlayer);
        if (checkVictory(x, y)) {
            winner = currentPlayer;
        } else {
            togglePlayer();
        }
    }

    private void togglePlayer() {
        currentPlayer = currentPlayer.equals("X") ? "+" : "X";
    }

    private boolean checkVictory(int x, int y) {
        String piece = board.getPiece(x, y);
        return checkRow(x, piece) || checkColumn(y, piece) || checkDiagonals(piece);
    }

    private boolean checkRow(int row, String piece) {
        for (int y = 0; y < 3; y++) {
            if (!piece.equals(board.getPiece(row, y))) return false;
        }
        return true;
    }

    private boolean checkColumn(int col, String piece) {
        for (int x = 0; x < 3; x++) {
            if (!piece.equals(board.getPiece(x, col))) return false;
        }
        return true;
    }

    private boolean checkDiagonals(String piece) {
        boolean mainDiagonal = true;
        boolean antiDiagonal = true;
        for (int i = 0; i < 3; i++) {
            if (!piece.equals(board.getPiece(i, i))) mainDiagonal = false;
            if (!piece.equals(board.getPiece(i, 2 - i))) antiDiagonal = false;
        }
        return mainDiagonal || antiDiagonal;
    }

    public Board getBoard() {
        return board;
    }
}
