package main.models.printPieces;

import core.enums.PieceType;
import main.abstractions.IPrintPiece;

public class RookPrintPiece implements IPrintPiece {
    @Override
    public String getSymbol(PieceType pieceType) {
        if (pieceType == PieceType.BLACK)
            return "r";
        return "R";
    }
}
