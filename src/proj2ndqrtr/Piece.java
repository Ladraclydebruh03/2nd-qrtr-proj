/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2ndqrtr;

import java.util.ArrayList;

/**
 *
 * @author ClydeLaptop
 */
public abstract class Piece {
    protected String color, name;
    protected int value, tileNum;
    
    public Piece(String n, int posX, int posY, int v, String c){
        value = v;
        Board.placePieceOnTile(posX, posY, this);
        name = n;
        color = c;
        tileNum = (posY-1)*8 + posX;
    }
    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
    public void changeColor(){
        if(color.equals("white"))
            color = "black";
        else
            color = "white";
    }
    public String getColor(){
        return color;
    }
   //can throw exceptions for invalid move and out of bounds move (eg 9, 10)

    public abstract void Move(Board board, int newX, int newY);

    public abstract void Capture(Board board, int newX, int newY);
}
