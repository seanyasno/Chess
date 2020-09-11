package core.models;

import core.abstractions.*;

public class Board implements IBoard {
    private final ICell[][] cells;
    private final int width;
    private final int height;
    private final IBoardReset boardReset;

    public Board() {
        this.width = 8;
        this.height = 8;
        this.cells = new ICell[width][height];
        boardReset = new BoardReset();
    }

    @Override
    public void init() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new Cell(x, y);
            }
        }
    }

    @Override
    public ICell[][] getCells() {
        return cells;
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
        if (canMove(currentCell, newCell)) {
            currentCell.getPiece().getMovement().move(currentCell, newCell);
        }
    }

    @Override
    public boolean canMove(ICell currentCell, ICell newCell) {
        return currentCell.getPiece().getMovement().canMove(this, currentCell, newCell);
    }

    @Override
    public int getPieceTypeDirection(IPiece piece) {
        switch (piece.getPieceType()) {
            case WHITE:
                return 1;
            case BLACK:
                return -1;
            default:
                return 0;
        }
    }

    @Override
    public IPiece getPieceAt(int x, int y) {
        return cells[x][y].getPiece();
    }

    @Override
    public ICell getCellAt(int x, int y) {
        return cells[x][y];
    }

    @Override
    public void reset() {
        boardReset.reset(this);
    }

    private void cleanBoard() {
        boardReset.clean(this);
    }
}
