package core.abstractions;

import core.enums.PieceType;

public abstract class PieceBase implements IPiece {
    private final String name;
    private final PieceType pieceType;
    private final IPieceMovement movement;

    public PieceBase(String name, PieceType pieceType, IPieceMovement movement) {
        this.name = name;
        this.pieceType = pieceType;
        this.movement = movement;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PieceType getPieceType() {
        return pieceType;
    }

    @Override
    public IPieceMovement getMovement() {
        return movement;
    }
}
