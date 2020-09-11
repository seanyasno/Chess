package core.models.pieces.rook;

import core.abstractions.PieceBase;
import core.enums.PieceType;

public class Rook extends PieceBase {
    public Rook(PieceType pieceType) {
        super("Rook", pieceType, new RookMovement());
    }
}
