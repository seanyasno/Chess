package core.abstractions;

public interface IBoard {
    ICell[][] getCells();
    int getWidth();
    int getHeight();
    void movePiece(ICell currentCell, ICell newCell);
    boolean canMove(ICell currentCell, ICell newCell);
    int getPieceTypeDirection(IPiece piece);
    void Reset();
}
