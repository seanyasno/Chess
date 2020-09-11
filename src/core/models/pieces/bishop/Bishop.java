package core.models.pieces.bishop;

import core.abstractions.IPieceMovement;
import core.abstractions.PieceBase;
import core.enums.PieceType;

public class Bishop extends PieceBase {
    public Bishop(PieceType pieceType) {
        super("Bishop", pieceType, new BishopMovement());
    }
}
