package main.abstractions;

import core.enums.PieceType;

public interface IPrintPiece {
    String getSymbol(PieceType pieceType);
}
