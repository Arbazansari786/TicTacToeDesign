package com.lti.model;

import com.lti.interfaces.Player;

public class Result {

    private final Player winner;
    private final boolean isDraw;

    public Result(Player winner, boolean isDraw) {
        this.winner = winner;
        this.isDraw = isDraw;
    }


    public Player getWinner() {
        return winner;
    }

    public boolean isDraw() {
        return isDraw;
    }
}
