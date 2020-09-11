package core.models.pieces.pawn;

import core.abstractions.PieceBase;
import core.enums.PieceType;

public class Pawn extends PieceBase {
    public Pawn(PieceType pieceType) {
        super("Pawn", pieceType, new PawnMovement());
    }
}
