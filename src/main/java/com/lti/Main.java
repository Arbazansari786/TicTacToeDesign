package com.lti;

import com.lti.interfaces.Board;
import com.lti.interfaces.Game;
import com.lti.interfaces.Player;
import com.lti.model.HumanPlayer;
import com.lti.model.Result;
import com.lti.model.TicTacToe;
import com.lti.model.TicTacToeBoard;

public class Main {
    public static void main(String[] args) {

        Player player1=new HumanPlayer("Arbaz",'X');
        Player player2=new HumanPlayer("Altaf",'O');
        Board ticTacToeBoard=new TicTacToeBoard();

        Game ticTacToe=new TicTacToe(player1,player2,ticTacToeBoard);
        Result result=ticTacToe.start();
        if(result.isDraw())
            System.out.println("Match is Draw");
        else
            System.out.println("Winner is "+result.getWinner().getName()+" with symbol "+result.getWinner().getSymbol());
    }
}