package core.models.pieces.pawn;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.IPiece;
import core.abstractions.PieceMovementBase;

public class PawnMovement extends PieceMovementBase {
    private boolean firstMove;

    public PawnMovement() {
        firstMove = true;
    }

    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        int direction = board.getPieceTypeDirection(currentCell.getPiece());
        int heightDifference = (newCell.getX() - currentCell.getX()) * direction;
        int widthDifference = (newCell.getY() - currentCell.getY());
        if (heightDifference <= 2 && heightDifference != 0) {
            if (heightDifference == 1) {
                return (newCell.isEmpty() && widthDifference == 0) || canEat(currentCell, newCell);
            } else {
                return firstMove && newCell.isEmpty() && board.getCells()[currentCell.getX() + direction][currentCell.getY()].isEmpty();
            }
        }
        return false;
    }

    @Override
    public IPiece move(ICell currentCell, ICell newCell) {
        if (firstMove)
            firstMove = false;
        return super.move(currentCell, newCell);
    }

    private boolean canEat(ICell currentCell, ICell newCell) {
        if (newCell.getPiece() == null) return false;
        int widthDifference = (newCell.getY() - currentCell.getY());
        if (Math.abs(widthDifference) == 1) {
            return newCell.getPiece().getPieceType() != currentCell.getPiece().getPieceType();
        }
        return false;
    }
}
