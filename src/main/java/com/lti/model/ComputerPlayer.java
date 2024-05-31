package com.lti.model;

import com.lti.interfaces.Board;
import com.lti.interfaces.Player;

import java.util.Random;

public class ComputerPlayer implements Player {

    private final String name;
    private final Character symbol;

    ComputerPlayer(String name, Character symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Character getSymbol() {
        return symbol;
    }

    @Override
    public Move play(Board board) {
        Dimension dimension = board.getDimension();
        int rows = dimension.getRows();
        int cols = dimension.getCols();

        Random random = new Random();
        int x=random.nextInt(3);
        int y=random.nextInt(3);

        return new Move(x,y);

    }
}
