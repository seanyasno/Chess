package core.abstractions;

public interface ICell {
    int getX();
    int getY();
    IPiece getPiece();
    void setPiece(IPiece piece);
    boolean isEmpty();
}
