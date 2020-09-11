package core.models.pieces.rook;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.IPieceMovement;

public class RookMovement implements IPieceMovement {
    @Override
    public boolean canMove(IBoard board, ICell currentCell, ICell newCell) {
        int widthDifference = Math.abs(currentCell.getY() - newCell.getY());
        int heightDifference = Math.abs(currentCell.getX() - newCell.getX());
        if (widthDifference != 0 && heightDifference != 0) return false;

        for (int x = Math.min(currentCell.getX(), newCell.getX()) + 1; x < Math.max(currentCell.getX(), newCell.getX()); x++) {
            if (!board.getCells()[x][currentCell.getY()].isEmpty())
                return false;
        }
        for (int y = Math.min(currentCell.getY(), newCell.getY()) + 1; y < Math.max(currentCell.getY(), newCell.getY()); y++) {
            if (!board.getCells()[currentCell.getX()][y].isEmpty())
                return false;
        }
        return newCell.isEmpty() || (newCell.getPiece().getPieceType() != currentCell.getPiece().getPieceType());
    }

    @Override
    public void move() {

    }
}
