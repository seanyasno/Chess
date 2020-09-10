package core.abstractions;

public interface IPieceMovement {
    boolean canMove(ICell currentCell, ICell newCell);
}
