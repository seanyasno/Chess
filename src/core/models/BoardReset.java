package core.models;

import core.abstractions.IBoard;
import core.abstractions.IBoardReset;
import core.enums.PieceType;
import core.models.pieces.bishop.Bishop;
import core.models.pieces.king.King;
import core.models.pieces.knight.Knight;
import core.models.pieces.pawn.Pawn;
import core.models.pieces.queen.Queen;
import core.models.pieces.rook.Rook;

public class BoardReset implements IBoardReset {
    private IBoard board;

    @Override
    public void reset(IBoard board) {
        this.board = board;
        setPawns();
        setRooks();
        setBishops();
        setKnights();
        setQueens();
        setKings();
    }

    @Override
    public void clean(IBoard board) {
        for (int x = 0; x < board.getWidth(); x++) {
            for (int y = 0; y < board.getHeight(); y++) {
                board.getCells()[x][y].setPiece(null);
            }
        }
    }

    private void setPawns() {
        for (int y = 1; y < board.getWidth(); y++) {
            board.getCells()[1][y].setPiece(new Pawn(PieceType.WHITE));
            board.getCells()[board.getHeight() - 2][y].setPiece(new Pawn(PieceType.BLACK));
        }
    }

    private void setRooks() {
        board.getCells()[0][0].setPiece(new Rook(PieceType.WHITE));
        board.getCells()[0][board.getWidth() - 1].setPiece(new Rook(PieceType.WHITE));
        board.getCells()[board.getHeight() - 1][0].setPiece(new Rook(PieceType.BLACK));
        board.getCells()[board.getHeight() - 1][board.getWidth() - 1].setPiece(new Rook(PieceType.BLACK));
    }

    private void setBishops() {
        board.getCells()[0][2].setPiece(new Bishop(PieceType.WHITE));
        board.getCells()[0][board.getWidth() - 3].setPiece(new Bishop(PieceType.WHITE));
        board.getCells()[board.getHeight() - 1][2].setPiece(new Bishop(PieceType.BLACK));
        board.getCells()[board.getHeight() - 1][board.getWidth() - 3].setPiece(new Bishop(PieceType.BLACK));
    }

    private void setKnights() {
        board.getCells()[0][1].setPiece(new Knight(PieceType.WHITE));
        board.getCells()[0][board.getWidth() - 2].setPiece(new Knight(PieceType.WHITE));
        board.getCells()[board.getHeight() - 1][1].setPiece(new Knight(PieceType.BLACK));
        board.getCells()[board.getHeight() - 1][board.getWidth() - 2].setPiece(new Knight(PieceType.BLACK));
    }

    private void setQueens() {
        board.getCells()[0][4].setPiece(new Queen(PieceType.WHITE));
        board.getCells()[board.getHeight() - 1][3].setPiece(new Queen(PieceType.BLACK));
    }

    private void setKings() {
        board.getCells()[0][3].setPiece(new King(PieceType.WHITE));
        board.getCells()[board.getHeight() - 1][4].setPiece(new King(PieceType.BLACK));
    }
}
