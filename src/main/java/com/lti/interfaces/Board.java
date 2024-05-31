package com.lti.interfaces;

import com.lti.model.Dimension;
import com.lti.model.Move;

public interface Board {

    public void applyMove(Move move, Character symbol);
    public Boolean isWin(Player player);
    public Boolean isBoardFull();

    public Dimension getDimension();

}
