/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj2ndqrtr;

/**
 *
 * @author ClydeLaptop
 */
public class Tile {
    private int xvalue;
    private int yvalue;
    private String color;
    private Piece p = null;
        
    public Tile(int x, int y, String c){
        xvalue = x;
        yvalue = y;
        color = c;
    }
    public String getColor(){
        return color;
    }
    public void placePiece(Piece x){
        p = x;
    }
    public void removePiece(){
        p = null;
    }
    public Piece getPiece(){
        return p;
    }
    
}
