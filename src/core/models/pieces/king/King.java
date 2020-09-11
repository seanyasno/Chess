package core.models.pieces.king;

import core.abstractions.PieceBase;
import core.enums.PieceType;

public class King extends PieceBase {
    public King(PieceType pieceType) {
        super("King", pieceType, new KingMovement());
    }
}
