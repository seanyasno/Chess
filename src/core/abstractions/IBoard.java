package core.abstractions;

public interface IBoard {
    ICell[][] getBoard();
    int getWidth();
    int getHeight();
    void movePiece(ICell currentCell, ICell newCell);
    boolean canMove(ICell currentCell, ICell newCell);
    void Reset();
}
