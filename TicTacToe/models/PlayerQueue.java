package TicTacToe.models;

import TicTacToe.enums.Symbol;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class PlayerQueue {

    private Queue<Player> playerQueue;

    public PlayerQueue(List<Player> playerList) {
        this.playerQueue = new LinkedList<>();
        if(!playerList.isEmpty()) {
            playerList.stream()
                    .filter(Objects::nonNull)
                    .forEach(player ->
                            playerQueue.add(player));
        }
    }

    public Player getCurrentPlayer() {
        Player currentPlayer = this.playerQueue.poll();
        this.playerQueue.add(currentPlayer);
        return currentPlayer;
    }
}
