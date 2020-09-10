package core.models.pieces.pawn;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.IPieceMovement;

public class PawnMovement implements IPieceMovement {
    private boolean firstMove;

    public PawnMovement() {
        firstMove = true;
    }

    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        int heightDifference = newCell.getY() - currentCell.getY();
        if (heightDifference <= 2 && heightDifference != 0) {
            if (heightDifference == 1 || (heightDifference == 2 && firstMove)) {
                return newCell.isEmpty();
            }
        }

        return false;
    }

    @Override
    public void move() {
        if (firstMove) {
            firstMove = false;
        }
    }
}
