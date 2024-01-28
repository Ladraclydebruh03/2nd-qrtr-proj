/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2ndqrtr;

/**
 *
 * @author ClydeLaptop
 */
import java.util.ArrayList;

public class testCode {
    public static void main(String[] args){
        Board board = new Board();
        board.assignTiles();
        Computer c = new Computer();
        
        //Scenario 1

        Pawn p1b = new Pawn("pawn", 1, 2, 1, "black");
        Pawn p2b = new Pawn("pawn", 2, 2, 1, "black");
        Pawn p3b = new Pawn("pawn", 3, 2, 1, "black");
        Pawn p4b = new Pawn("pawn", 4, 2, 1, "black");
        Pawn p5b = new Pawn("pawn", 5, 2, 1, "black");
        Pawn p6b = new Pawn("pawn", 6, 2, 1, "black");
        Pawn p7b = new Pawn("pawn", 7, 2, 1, "black");
        Pawn p8b = new Pawn("pawn", 8, 2, 1, "black");
        
        Rook r1b = new Rook("rook", 1, 1, 5, "black");
        Rook r2b = new Rook("rook", 8, 1, 5, "black");
        
        Knight k1b= new Knight("knight", 2, 1, 3, "black");
        Knight k2b= new Knight("knight", 7, 1, 3, "black");
        
        Bishop b1b = new Bishop("bishop", 3, 1, 3, "black");
        Bishop b2b = new Bishop("bishop", 6, 1, 3, "black");
        
        King kingb = new King("king", 5, 1, 20, "black");
        Queen q1b = new Queen("queen", 4, 1, 9, "black");
        
        Pawn p1w = new Pawn("pawn", 1, 7, 1, "white");
        Pawn p2w = new Pawn("pawn", 2, 7, 1, "white");
        Pawn p3w = new Pawn("pawn", 3, 7, 1, "white");
        Pawn p4w = new Pawn("pawn", 4, 7, 1, "white");
        Pawn p5w = new Pawn("pawn", 5, 7, 1, "white");
        Pawn p6w = new Pawn("pawn", 6, 7, 1, "white");
        Pawn p7w = new Pawn("pawn", 7, 7, 1, "white");
        Pawn p8w = new Pawn("pawn", 8, 7, 1, "white");
        
        Knight k1w= new Knight("knight", 2, 8, 3, "white");
        Knight k2w= new Knight("knight", 7, 8, 3, "white");
        
        Bishop b1w = new Bishop("bishop", 3, 8, 3, "white");
        Bishop b2w = new Bishop("bishop", 6, 8, 3, "white");
        
        King kingw = new King("king", 5, 8, 10, "white");
        Queen q1w = new Queen("queen", 4, 8, 9, "white");  
        
        Rook r1w = new Rook("rook", 1, 8, 5, "white");
        Rook r2w = new Rook("rook", 8, 8, 5, "white");
        
        System.out.println("Scenario 1");
        p5w.Move(board, 5, 5);  //player 1 moves a pawn
        p5b.Move(board, 5, 4);  //player 2 moves a pawn
        b2w.Move(board, 3, 5);  //player 1 moves a bishop
        k1b.Move(board, 3, 3);  //player 2 moves a knight
        q1w.Move(board, 8, 4);  //player 1 moves the queen
        p6b.Move(board, 6, 3);  //player 2 moves a pawn
        q1w.Capture(board, 5, 1);   //player 1 challenges enemy king
        c.endGame("White");     //for the sake of the scenario, we'll end it with player 1 wins
        
        
        //Scenario 2
        board.clearBoard();
        p1b = new Pawn("pawn", 1, 2, 1, "black");
        p2b = new Pawn("pawn", 2, 2, 1, "black");
        p3b = new Pawn("pawn", 3, 2, 1, "black");
        p4b = new Pawn("pawn", 4, 2, 1, "black");
        p5b = new Pawn("pawn", 5, 2, 1, "black");
        p6b = new Pawn("pawn", 6, 2, 1, "black");
        p7b = new Pawn("pawn", 7, 2, 1, "black");
        p8b = new Pawn("pawn", 8, 2, 1, "black");
        
        r1b = new Rook("rook", 1, 1, 5, "black");
        r2b = new Rook("rook", 8, 1, 5, "black");
        
        k1b= new Knight("knight", 2, 1, 3, "black");
        k2b= new Knight("knight", 7, 1, 3, "black");
        
        b1b = new Bishop("bishop", 3, 1, 3, "black");
        b2b = new Bishop("bishop", 6, 1, 3, "black");
        
        kingb = new King("king", 5, 1, 20, "black");
        q1b = new Queen("queen", 4, 1, 9, "black");
        
        p1w = new Pawn("pawn", 1, 7, 1, "white");
        p2w = new Pawn("pawn", 2, 7, 1, "white");
        p3w = new Pawn("pawn", 3, 7, 1, "white");
        p4w = new Pawn("pawn", 4, 7, 1, "white");
        p5w = new Pawn("pawn", 5, 7, 1, "white");
        p6w = new Pawn("pawn", 6, 7, 1, "white");
        p7w = new Pawn("pawn", 7, 7, 1, "white");
        p8w = new Pawn("pawn", 8, 7, 1, "white");
        
        k1w= new Knight("knight", 2, 8, 3, "white");
        k2w= new Knight("knight", 7, 8, 3, "white");
        
        b1w = new Bishop("bishop", 3, 8, 3, "white");
        b2w = new Bishop("bishop", 6, 8, 3, "white");
        
        kingw = new King("king", 5, 8, 10, "white");
        q1w = new Queen("queen", 4, 8, 9, "white");  
        
        r1w = new Rook("rook", 1, 8, 5, "white");
        r2w = new Rook("rook", 8, 8, 5, "white");
        
        System.out.println("\nScenario 2");
        p5w.Move(board, 5, 5);  //white moves pawn
        p5b.Move(board, 5, 3);  //black moves pawn
        k2w.Move(board, 6, 6);  //white moves knight
        q1b.Move(board, 7, 4);  //black moves queen
        k2w.Capture(board, 7, 4);   //for the sake of the scenario, knight wins the dice roll/coin flip
        c.resign("Black");
        
        //Scenario 3
        System.out.println("\nScenario 3");
        board.clearBoard();
        p1b = new Pawn("pawn", 1, 2, 1, "black");
        p2b = new Pawn("pawn", 2, 2, 1, "black");
        p3b = new Pawn("pawn", 3, 2, 1, "black");
        p4b = new Pawn("pawn", 4, 2, 1, "black");
        p5b = new Pawn("pawn", 5, 2, 1, "black");
        p6b = new Pawn("pawn", 6, 2, 1, "black");
        p7b = new Pawn("pawn", 7, 2, 1, "black");
        p8b = new Pawn("pawn", 8, 2, 1, "black");
        
        r1b = new Rook("rook", 1, 1, 5, "black");
        r2b = new Rook("rook", 8, 1, 5, "black");
        
        k1b= new Knight("knight", 2, 1, 3, "black");
        k2b= new Knight("knight", 7, 1, 3, "black");
        
        b1b = new Bishop("bishop", 3, 1, 3, "black");
        b2b = new Bishop("bishop", 6, 1, 3, "black");
        
        kingb = new King("king", 5, 1, 20, "black");
        q1b = new Queen("queen", 4, 1, 9, "black");
        
        p1w = new Pawn("pawn", 1, 7, 1, "white");
        p2w = new Pawn("pawn", 2, 7, 1, "white");
        p3w = new Pawn("pawn", 3, 7, 1, "white");
        p4w = new Pawn("pawn", 4, 7, 1, "white");
        p5w = new Pawn("pawn", 5, 7, 1, "white");
        p6w = new Pawn("pawn", 6, 7, 1, "white");
        p7w = new Pawn("pawn", 7, 7, 1, "white");
        p8w = new Pawn("pawn", 8, 7, 1, "white");
        
        k1w= new Knight("knight", 2, 8, 3, "white");
        k2w= new Knight("knight", 7, 8, 3, "white");
        
        b1w = new Bishop("bishop", 3, 8, 3, "white");
        b2w = new Bishop("bishop", 6, 8, 3, "white");
        
        kingw = new King("king", 5, 8, 10, "white");
        q1w = new Queen("queen", 4, 8, 9, "white");  
        
        r1w = new Rook("rook", 1, 8, 5, "white");
        r2w = new Rook("rook", 8, 8, 5, "white");
        
        p5w.Move(board, 5, 5);  //white moves pawn
        p5b.Move(board, 5, 4);  //black moves pawn
        k2w.Move(board, 6, 6);  //white moves knight
        p4b.Move(board, 4, 3);  //black moves pawn
        p4w.Move(board, 4, 5);  //white moves pawn
        b1b.Move(board, 6, 4);  //black moves bishop
        p5w.Capture(board, 6, 4);   //for the sake of the scenario, pawn won the dice roll/coin flip
        c.Draw();   //draw was offered and accepted
    }
}
