package main.models.printPieces;

import core.enums.PieceType;
import main.abstractions.IPrintPiece;

public class BishopPrintPiece implements IPrintPiece {
    @Override
    public String getSymbol(PieceType pieceType) {
        if (pieceType == PieceType.BLACK)
            return "b";
        return "B";
    }
}
