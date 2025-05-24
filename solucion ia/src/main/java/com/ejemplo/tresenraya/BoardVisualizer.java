package main.java.com.ejemplo.tresenraya;

public class BoardVisualizer {

    public static void print(Board board) {
        System.out.println("  0   1   2 ");
        for (int x = 0; x < 3; x++) {
            System.out.print(x + " ");
            for (int y = 0; y < 3; y++) {
                String piece = board.getPiece(x, y);
                System.out.print(piece != null ? piece : " ");
                if (y < 2) System.out.print(" | ");
            }
            System.out.println();
            if (x < 2) System.out.println("  ---------");
        }
    }
}
