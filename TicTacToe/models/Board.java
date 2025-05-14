package TicTacToe.models;

import TicTacToe.enums.Symbol;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int gridSize;
    private List<List<Symbol>> grid;

    public Board(int gridSize) {
        this.gridSize = gridSize;
        this.grid = new ArrayList<>(gridSize);
        for (int i = 0; i < gridSize; i++) {
            List<Symbol> row = new ArrayList<>(gridSize);
            for (int j = 0; j < gridSize; j++) {
                row.add(Symbol.EMPTY);
            }
            this.grid.add(row);
        }
    }

    public Symbol getBoxGrid(int row , int column) {
        return this.grid.get(row).get(column);
    }

    public int getGridSize() {
        return this.gridSize;
    }


    public boolean isMoveValid(int row, int column) {
        /* Size validation */
        if(row < 0 || column < 0 || row >= this.gridSize || column >= this.gridSize) {
            return false;
        }
        /* Empty validation */
        return Symbol.EMPTY.equals(this.grid.get(row).get(column));
    }

    public void placeMove(int row, int column, Symbol symbol) {
        this.grid.get(row).set(column, symbol);
    }
}
