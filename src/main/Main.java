package main;

import core.abstractions.IBoard;
import core.abstractions.IPiece;
import core.models.Board;
import core.models.Cell;

public class Main {
    public static void main(String[] args) {
        IBoard board = new Board();
        board.init();
        board.reset();
        printBoard(board);
    }

    private static void printBoard(IBoard board) {
        System.out.println("  01234567");
        for (int x = 0; x < board.getWidth(); x++) {
            System.out.print(x + " ");
            for (int y = 0; y < board.getHeight(); y++) {
                IPiece piece = board.getCells()[x][y].getPiece();
                if (piece == null) {
                    System.out.print("_");
                } else {
                    switch (piece.getName()) {
                        case "Pawn":
                            System.out.print("P");
                            break;
                    }
                }
            }
            System.out.println();
        }
    }
}
