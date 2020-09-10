package core.models.pieces.pawn;

import core.abstractions.IPiece;
import core.abstractions.IPieceMovement;
import core.enums.PieceType;

public class Pawn implements IPiece {
    private final PieceType pieceType;
    private final IPieceMovement movement;

    public Pawn(PieceType pieceType) {
        this.pieceType = pieceType;
        this.movement = new PawnMovement();
    }

    @Override
    public String getName() {
        return "Pawn";
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
