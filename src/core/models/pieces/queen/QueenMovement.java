package core.models.pieces.queen;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.PieceMovementBase;

public class QueenMovement extends PieceMovementBase {
    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        return false;
    }
}
