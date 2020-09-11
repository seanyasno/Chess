package main.models;

import core.abstractions.IBoard;
import core.abstractions.IPiece;
import main.abstractions.IBoardPrinter;
import main.abstractions.IPrintPiece;
import main.models.printPieces.*;

import java.util.HashMap;
import java.util.Map;

public class BoardPrinter implements IBoardPrinter {
    private final Map<String, IPrintPiece> printPieces;

    public BoardPrinter() {
        printPieces = new HashMap<>();
        printPieces.put("Pawn", new PawnPrintPiece());
        printPieces.put("Rook", new RookPrintPiece());
        printPieces.put("Bishop", new BishopPrintPiece());
        printPieces.put("Knight", new KnightPrintPiece());
        printPieces.put("Queen", new QueenPrintPiece());
        printPieces.put("King", new KingPrintPiece());
    }

    @Override
    public void print(IBoard board) {
        System.out.println("  01234567");
        for (int x = 0; x < board.getWidth(); x++) {
            System.out.print(x + " ");
            for (int y = 0; y < board.getHeight(); y++) {
                IPiece piece = board.getCells()[x][y].getPiece();
                if (piece == null) {
                    System.out.print("_");
                } else {
                    System.out.print(printPieces.get(piece.getName()).getSymbol(piece.getPieceType()));
                }
            }
            System.out.println();
        }
    }
}
