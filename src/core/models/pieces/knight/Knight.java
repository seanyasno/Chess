package core.models.pieces.knight;

import core.abstractions.PieceBase;
import core.enums.PieceType;

public class Knight extends PieceBase {
    public Knight(PieceType pieceType) {
        super("Knight", pieceType, new KnightMovement());
    }
}
