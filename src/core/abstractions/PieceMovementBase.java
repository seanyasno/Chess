package core.abstractions;

public abstract class PieceMovementBase implements IPieceMovement {
    @Override
    public IPiece move(ICell currentCell, ICell newCell) {
        IPiece newCellPiece = newCell.getPiece();
        newCell.setPiece(currentCell.getPiece());
        currentCell.setPiece(null);
        return newCellPiece;
    }
}
