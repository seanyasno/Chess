package core.abstractions;

public interface IPieceMovement {
    boolean canMove(IBoard board, ICell currentCell, ICell newCell);
    IPiece move(ICell currentCell, ICell newCell);
}
