package com.lti.interfaces;

import com.lti.model.Move;

public interface Player {



    public String getName();

    public Character getSymbol();

    public Move play(Board board);


}
