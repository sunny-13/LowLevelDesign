package TicTacToe;

import TicTacToe.enums.Symbol;
import TicTacToe.models.Board;

public class GameEngine {

    public boolean isGameOver(Board board) {
        return isWinnerApplicable(board) || isBoardFull(board);
    }

    private boolean isWinnerApplicable(Board board) {
        int gridSize = board.getGridSize();
        int xCount = 0, yCount = 0;
        /* Checking rows */
        for (int row = 0; row < gridSize; row++) {
            xCount = 0;
            yCount = 0;
            for (int column = 0; column < gridSize; column++) {
                if(Symbol.X.equals(board.getBoxGrid(row, column))) {
                    xCount++;
                } else if (Symbol.O.equals(board.getBoxGrid(row, column))) {
                    yCount++;
                }
            }
            if(checkWinner(xCount, yCount, gridSize)) {
                return true;
            }
        }

        /* Checking columns */
        for (int column = 0; column < gridSize; column++) {
            xCount = 0;
            yCount = 0;
            for (int row = 0; row < gridSize; row++) {
                if(Symbol.X.equals(board.getBoxGrid(row, column))) {
                    xCount++;
                } else if (Symbol.O.equals(board.getBoxGrid(row, column))) {
                    yCount++;
                }
            }
            if(checkWinner(xCount, yCount, gridSize)) {
                return true;
            }
        }

        xCount = 0;
        yCount = 0;
        /* Checking Primary diagonal */
        for (int i = 0; i < gridSize; i++) {
            Symbol symbolAtBox = board.getBoxGrid(i, i);
            if(Symbol.X.equals(symbolAtBox)) {
                xCount++;
            } else if (Symbol.O.equals(symbolAtBox)) {
                yCount++;
            }
        }
        if(checkWinner(xCount, yCount, gridSize)) {
            return true;
        }

        xCount = 0;
        yCount = 0;
        /* Checking Secondary diagonal */
        for (int i = 0; i < gridSize; i++) {
            Symbol symbolAtBox = board.getBoxGrid(i, gridSize-1-i);
            if(Symbol.X.equals(symbolAtBox)) {
                xCount++;
            } else if (Symbol.O.equals(symbolAtBox)) {
                yCount++;
            }
        }
        if(checkWinner(xCount, yCount, gridSize)) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull(Board board) {
        int gridSize = board.getGridSize();
        for (int row = 0; row < gridSize; row++) {
            for (int column = 0; column < gridSize; column++) {
                if(Symbol.EMPTY.equals(board.getBoxGrid(row, column))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWinner(int xCount, int yCount, int gridSize) {
        if(xCount == gridSize) {
            System.out.println("PlayerX has won the match");
            return true;
        } else if (yCount == gridSize) {
            System.out.println("PlayerY has won the match");
            return true;
        }
        return false;
    }
}
