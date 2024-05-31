package com.lti.interfaces;

import com.lti.model.Move;

public interface Player {



     String getName();

     Character getSymbol();

     Move play(Board board);


}
