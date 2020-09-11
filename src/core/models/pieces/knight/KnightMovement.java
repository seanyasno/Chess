package core.models.pieces.knight;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.PieceMovementBase;

public class KnightMovement extends PieceMovementBase {
    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        return false;
    }
}
