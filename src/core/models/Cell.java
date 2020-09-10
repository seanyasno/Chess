package core.models;

import core.abstractions.ICell;
import core.abstractions.IPiece;

public class Cell implements ICell {
    private final int x;
    private final int y;
    private IPiece piece;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public IPiece getPiece() {
        return piece;
    }

    @Override
    public void setPiece(IPiece piece) {
        this.piece = piece;
    }

    @Override
    public boolean isEmpty() {
        return piece == null;
    }
}
