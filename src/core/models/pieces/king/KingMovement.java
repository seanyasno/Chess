package core.models.pieces.king;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.PieceMovementBase;

public class KingMovement extends PieceMovementBase {
    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        return false;
    }
}
