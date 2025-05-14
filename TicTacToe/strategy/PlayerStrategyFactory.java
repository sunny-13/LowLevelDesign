package TicTacToe.strategy;

import TicTacToe.enums.Strategy;

public class PlayerStrategyFactory {

    public PlayerStrategy getPlayerStrategy(Strategy strategy) {
        if(Strategy.HUMAN.equals(strategy)) {
            return new HumanStrategy();
        } else if (Strategy.AI.equals(strategy)) {
            /* implement a AI strategy and return its object */
        }
        return new HumanStrategy();
    }
}
