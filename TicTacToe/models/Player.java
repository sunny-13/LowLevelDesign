package TicTacToe.models;

import TicTacToe.strategy.PlayerStrategy;
import TicTacToe.strategy.PlayerStrategyFactory;
import TicTacToe.enums.Strategy;
import TicTacToe.enums.Symbol;

public class Player {

    private String name;
    private Symbol symbol;
    private PlayerStrategy playerStrategy;

    public Player(String name, Symbol symbol, Strategy strategy) {
        this.name = name;
        this.symbol = symbol;
        this.playerStrategy = new PlayerStrategyFactory().getPlayerStrategy(strategy);
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void makeMove(Board board) {
        playerStrategy.makeMove(board, this.symbol);
    }
}
