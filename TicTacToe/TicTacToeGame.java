package TicTacToe;

import TicTacToe.enums.GameState;
import TicTacToe.enums.Strategy;
import TicTacToe.enums.Symbol;
import TicTacToe.models.Board;
import TicTacToe.models.Player;
import TicTacToe.models.PlayerQueue;

import java.util.Arrays;

public class TicTacToeGame {

    private PlayerQueue playerQueue;
    private Board board;
    private GameState gameState;
    private GameEngine gameEngine;

    public TicTacToeGame(Strategy playerXStrategy, Strategy playerOStrategy, int gridSize) {
        Player playerX = new Player("PlayerX", Symbol.X, playerXStrategy);
        Player playerO = new Player("PlayerO", Symbol.O, playerOStrategy);
        this.playerQueue = new PlayerQueue(Arrays.asList(playerX, playerO));
        this.board = new Board(gridSize);
        this.gameState = GameState.IN_PROGRESS;
        this.gameEngine = new GameEngine();
    }


    public void play() {
        while (GameState.IN_PROGRESS.equals(gameState)) {
            playerQueue.getCurrentPlayer().makeMove(board);
            if(gameEngine.isGameOver(board)) {
                gameState = GameState.FINISHED;
            }
        }
    }
}
