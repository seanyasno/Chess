package core.abstractions;

public interface IBoard {
    void init();
    ICell[][] getCells();
    int getWidth();
    int getHeight();
    void movePiece(ICell currentCell, ICell newCell);
    boolean canMove(ICell currentCell, ICell newCell);
    int getPieceTypeDirection(IPiece piece);
    IPiece getPieceAt(int x, int y);
    ICell getCellAt(int x, int y);
    void reset();
}
