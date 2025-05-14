package TicTacToe.strategy;

import TicTacToe.enums.Symbol;
import TicTacToe.models.Board;

public interface PlayerStrategy {

    void makeMove(Board board, Symbol symbol);
}
