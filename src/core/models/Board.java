package core.models;

import core.abstractions.IBoard;
import core.abstractions.ICell;
import core.abstractions.IPiece;
import core.enums.PieceType;
import core.models.pieces.pawn.Pawn;

public class Board implements IBoard {
    private ICell[][] cells;
    private final int width;
    private final int height;

    public Board() {
        this.width = 8;
        this.height = 8;
        this.cells = new ICell[width][height];
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
            case BLACK:
                return -1;
            default:
                return 0;
        }
    }

    @Override
    public void Reset() {
        for (int x = 0; x < width; x++) {
            cells[x][1].setPiece(new Pawn(PieceType.WHITE));
            cells[x][height-1].setPiece(new Pawn(PieceType.BLACK));
        }
    }

    private void cleanBoard() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y].setPiece(null);
            }
        }
    }
}
