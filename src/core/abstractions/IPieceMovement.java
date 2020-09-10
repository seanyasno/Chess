package core.abstractions;

public interface IPieceMovement {
    boolean canMove(IBoard board, ICell currentCell, ICell newCell);
    void move();
}
