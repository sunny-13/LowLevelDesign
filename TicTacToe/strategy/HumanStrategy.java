package TicTacToe.strategy;

import TicTacToe.enums.Symbol;
import TicTacToe.models.Board;

import java.util.Scanner;

public class HumanStrategy implements PlayerStrategy {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void makeMove(Board board, Symbol symbol) {
        System.out.println("Make move :");
        int row  = -1;
        int column = -1;
        boolean movePlaced = false;
        while (!movePlaced) {
            try {
                System.out.println("Enter row (0-based index): ");
                row = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter column (0-based index): ");
                column = Integer.parseInt(scanner.nextLine());

                if(board.isMoveValid(row, column)) {
                    board.placeMove(row, column, symbol);
                    movePlaced = true;
                } else {
                    System.out.println("Placed move is Illegal, Please try again: ");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input. Please enter numeric values.");
            }

        }
    }
}
