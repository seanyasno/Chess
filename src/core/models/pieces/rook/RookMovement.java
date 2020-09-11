package core.models.pieces.rook;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.IPieceMovement;

public class RookMovement implements IPieceMovement {
    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        return false;
    }

    @Override
    public void move() {

    }
}
