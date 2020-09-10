package core.abstractions;

import core.enums.PieceType;

public interface IPiece {
    String getName();
    PieceType getPieceType();
    IPieceMovement getMovement();
}
