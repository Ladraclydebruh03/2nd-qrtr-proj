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
public class Board {
    private static ArrayList<Tile> tiles = new ArrayList<>();
    Tile holder = null;
    String color;
    
    public Board(){
        
    }
    public void assignTiles(){
        for(int x = 1; x <= 8; x++){
            for(int y = 1; y<=8; y++){
                if (x%2==1){
                    if(y%2==1)
                        color = "white";
                    else
                        color = "black";
                }
                else{
                    if(y%2==1)
                        color = "black";
                    else
                        color = "white";
                }
                holder = new Tile(x, y, color);
                tiles.add(holder);
            }
        }
    }
    public int getTileSize(){
        return tiles.size();
    }
    public int getY(int y){
        if(y % 8 == 0){
            return y/8;
        }
        return (y/8)+1;
    }
    public int getX(int x){
        if(x%8 == 0){
            return 8;
        }
        return x%8;
    }
    public String getColor(int num){
        return tiles.get(num).getColor();
    }
    //note: formula from x and y positions to tile index = (y-1)*8 + x
    public static void placePieceOnTile(int x, int y, Piece p){
        int tileNum = (y-1)*8 + x;
        tiles.get(tileNum-1).placePiece(p);
    }
    public static Piece getPieceOnTile(int x, int y){
        int tileNum = (y-1)*8 + x;
        return tiles.get(tileNum-1).getPiece();
    }
    public void removePieceFromTile(int x, int y){
        int tileNum = (y - 1) * 8 + x;
        tiles.get(tileNum-1).removePiece();
    }
    public void clearBoard(){
        for(int i = 0; i<tiles.size(); i++){
            tiles.get(i).removePiece();
        }
    }
}
