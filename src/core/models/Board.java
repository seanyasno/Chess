package core.models;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.IPiece;

public class Board implements IBoard {
    private ICell[][] board;
    private final int width;
    private final int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new ICell[width][height];
    }

    @Override
    public ICell[][] getCells() {
        return board;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void movePiece(ICell currentCell, ICell newCell) {

    }

    @Override
    public boolean canMove(ICell currentCell, ICell newCell) {
        return false;
    }

    @Override
    public int getPieceTypeDirection(IPiece piece) {
        switch (piece.getPieceType()) {
            case WHITE:
                return 1;
            case BLACk:
                return -1;
            default:
                return 0;
        }
    }

    @Override
    public void Reset() {
        board = new ICell[width][height];
    }
}
