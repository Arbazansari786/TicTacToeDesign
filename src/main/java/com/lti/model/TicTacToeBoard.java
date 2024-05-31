package com.lti.model;

import com.lti.interfaces.Board;
import com.lti.interfaces.Player;

public class TicTacToeBoard implements Board {

    Character board[][];


    public TicTacToeBoard() {
        board = new Character[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '.';
            }
        }
    }


    @Override
    public void applyMove(Move move, Character symbol) {
        board[move.getX()][move.getY()] = symbol;

    }

    @Override
    public Boolean isBoardFull() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]=='.')
                    return false;
            }
        }
        return true;
    }

    @Override
    public Dimension getDimension() {
        return new Dimension(3,3);
    }

    @Override
    public Boolean isWin(Player player) {
       Character symbol= player.getSymbol();
       return horizontalWin(symbol) || verticalWin(symbol) || diagonalWin(symbol);
    }


    public Boolean diagonalWin(Character symbol){
           if((board[0][0]==symbol && board[1][1]==symbol && board[2][2]==symbol)
           || (board[0][2]==symbol && board[1][1]==symbol && board[2][0]==symbol)  )
               return  true;
           return  false;

    }

    private Boolean horizontalWin(Character symbol){
        for(int i=0;i<3;i++){
            if(board[i][0]==symbol){
                if(board[i][1]==symbol && board[i][2]==symbol)
                    return true;
            }
        }
        return false;
    }

    public Boolean verticalWin(Character symbol){
        for(int i=0;i<3;i++){
            if(board[0][i]==symbol){
                if(board[1][i]==symbol && board[2][i]==symbol)
                    return  true;
            }
        }
        return false;
    }
}
