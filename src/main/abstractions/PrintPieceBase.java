package main.abstractions;

import core.enums.PieceType;

public abstract class PrintPieceBase implements IPrintPiece {
    private final String whiteSymbol;
    private final String blackSymbol;

    public PrintPieceBase(String whiteSymbol, String blackSymbol) {
        this.whiteSymbol = whiteSymbol;
        this.blackSymbol = blackSymbol;
    }

    @Override
    public String getSymbol(PieceType pieceType) {
        if (pieceType == PieceType.BLACK)
            return blackSymbol;
        return whiteSymbol;
    }
}
