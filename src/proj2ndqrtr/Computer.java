/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2ndqrtr;

import java.util.Random;
/**
 *
 * @author ClydeLaptop
 */
public class Computer {
    Random rand = new Random();
    public int diceNum;
    public int coinNum;
    public String coin;
    
    public int rollDice(){
        diceNum = rand.nextInt(6)+1;
        return diceNum;
    }
    public String flipCoin(){
        coinNum = rand.nextInt(2);
        coin = (coinNum==0) ? "heads" : "tails";
        
        return coin;
    }
    //not detailed yet
    public void endGame(String win){
        if(win.equalsIgnoreCase("white"))
            System.out.println("White won");
        else
            System.out.println("Black won");
    }
    public void resign(String lose){
        String win = lose.equalsIgnoreCase("white") ? "black" : "white";
        System.out.println("Since " + lose + " resigned, " + win + " won");
    }
    public void Draw(){
        System.out.println("The game is a draw");
    }
}
