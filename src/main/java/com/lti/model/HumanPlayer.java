package com.lti.model;

import com.lti.interfaces.Board;
import com.lti.interfaces.Player;

import java.util.Scanner;

public class HumanPlayer implements Player {

    private String name;
    private Character symbol;

    public String getName() {
        return name;
    }

    public Character getSymbol() {
        return symbol;
    }

    public HumanPlayer(String name, Character symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public Move play(Board board){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String coordinates[]= s.split(" ");
        int x=Integer.parseInt(coordinates[0]);
        int y=Integer.parseInt(coordinates[1]);
        return  new Move(x,y);
    }

}
