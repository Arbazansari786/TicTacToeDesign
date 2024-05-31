package com.lti.model;

import com.lti.interfaces.Board;
import com.lti.interfaces.Game;
import com.lti.interfaces.Player;

public class TicTacToe implements Game {

    private final Player player1;
    private final Player player2;

    private final Board ticTacToeBoard;

    public TicTacToe(Player player1, Player player2, Board ticTacToeBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.ticTacToeBoard = ticTacToeBoard;
    }

    @Override
    public Result start(){

        Player  currPlayer=player1;

        while(!ticTacToeBoard.isBoardFull()){
            Move move=currPlayer.play(ticTacToeBoard);
            ticTacToeBoard.applyMove(move,currPlayer.getSymbol());
            if(ticTacToeBoard.isBoardFull() || ticTacToeBoard.isWin(currPlayer)) {
                break;
            }
            if(currPlayer==player1)
                currPlayer=player2;
            else
                currPlayer=player1;
        }

        Result result=null;
        if(ticTacToeBoard.isWin(currPlayer))
            result=new Result(currPlayer,false);
        else
            result=new Result(null,true);
        return result;
    }

}
