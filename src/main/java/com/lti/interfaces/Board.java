package com.lti.interfaces;

import com.lti.model.Dimension;
import com.lti.model.Move;

public interface Board {

     void applyMove(Move move, Character symbol);
     Boolean isWin(Player player);
     Boolean isBoardFull();

     Dimension getDimension();

}
