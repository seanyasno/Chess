package main;

import core.abstractions.IBoard;
import core.models.Board;
import main.abstractions.IBoardPrinter;
import main.models.BoardPrinter;


public class Main {
    public static void main(String[] args) {
        IBoard board = new Board();
        IBoardPrinter boardPrinter = new BoardPrinter();
        board.init();
        board.reset();
        boardPrinter.print(board);

    }
}
