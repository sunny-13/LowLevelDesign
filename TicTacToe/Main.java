package TicTacToe;

import TicTacToe.enums.Strategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to fun TicTacToe!");
        TicTacToeGame ticTacToeGame = new TicTacToeGame(Strategy.HUMAN, Strategy.HUMAN, 3);
        ticTacToeGame.play();
    }
}
