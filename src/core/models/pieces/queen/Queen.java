package core.models.pieces.queen;

import core.abstractions.PieceBase;
import core.enums.PieceType;

public class Queen extends PieceBase {
    public Queen(PieceType pieceType) {
        super("Queen", pieceType, new QueenMovement());
    }
}
