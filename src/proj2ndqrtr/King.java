/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2ndqrtr;

/**
 *
 * @author ClydeLaptop
 */
public class King extends Piece{
    Computer c = new Computer();
    public King(String n, int posX, int posY, int v, String c){
    super(n, posX, posY, v, c);
    }
    
    @Override
    
    public void Move (Board board, int newX, int newY){
        int currentX = board.getX(tileNum);
        int currentY = board.getY(tileNum);
        int newTileNum = (newY - 1) * 8 + newX;
        
        if(newTileNum == tileNum-9 || newTileNum == tileNum-8 || newTileNum == tileNum-7 || newTileNum == tileNum-1 || newTileNum == tileNum+1 || newTileNum == tileNum+7 || newTileNum == tileNum+8 || newTileNum == tileNum+9){
            board.removePieceFromTile(currentX, currentY);
            tileNum = (newY - 1) * 8 + newX;
            board.placePieceOnTile(newX, newY, this);
        }
        else{
            System.out.println("The move is invalid");
        }
    }
    
    @Override
    public void Capture(Board board, int newX, int newY){
        int currentX = board.getX(tileNum);
        int currentY = board.getY(tileNum);
        int newTileNum = (newY - 1) * 8 + newX;
        int thisDice, enemyDice;
        String thisCoin = "heads", enemyCoin = "heads";
        
        if((newTileNum == tileNum-9 || newTileNum == tileNum-8 || newTileNum == tileNum-7 || newTileNum == tileNum-1 || newTileNum == tileNum+1 || newTileNum == tileNum+7 || newTileNum == tileNum+8 || newTileNum == tileNum+9) && board.getPieceOnTile(newX, newY)!=null){
            Piece enemyPiece = board.getPieceOnTile(newX, newY);
            thisDice = c.rollDice();
            enemyDice = c.rollDice();
            if(enemyPiece.getName().equals("king")){
                if(thisDice>enemyDice){
                    System.out.println("The capture was successful");
                    c.endGame(this.getColor());
                }
                else if(thisDice==enemyDice){
                    System.out.println("The two dices are equal, we shall proceed to the coin flip");
                    while(thisCoin.equals(enemyCoin)){
                        thisCoin = c.flipCoin();
                        enemyCoin = c.flipCoin();
                    }
                    if(thisCoin.equals("heads")){
                        System.out.println(this.getColor() + "won the flip coin");
                        c.endGame(this.getColor());
                    }
                    else{
                        System.out.println(enemyPiece.getColor() + "won the flip coin");
                        c.endGame(enemyPiece.getColor());
                    }
                }
                else{
                    System.out.println("You lost the dice roll");
                    c.endGame(enemyPiece.getColor());
                }
                
            }
            else{
                if(thisDice>enemyDice){
                    board.removePieceFromTile(newX, newY);
                    System.out.println(enemyDice);
                    board.removePieceFromTile(currentX, currentY);
                    board.placePieceOnTile(newX, newY, this);
                }
                else if (thisDice<enemyDice){
                    board.removePieceFromTile(currentX, currentY);
                    c.endGame(enemyPiece.getColor());
                }
                else{
                    while(thisCoin.equals(enemyCoin)){
                        thisCoin = c.flipCoin();
                        enemyCoin = c.flipCoin();
                    }
                    if(thisCoin.equals("heads")){
                        board.removePieceFromTile(newX, newY);
                        System.out.println("nanalo ata coin mo");
                        board.removePieceFromTile(currentX, currentY);
                        board.placePieceOnTile(newX, newY, this);
                    }
                    else
                        board.removePieceFromTile(currentX, currentY);
                        c.endGame(enemyPiece.getColor());
                }
            }
        }
        else if(board.getPieceOnTile(newX, newY)==null){
            System.out.println("Nothing to capture here");
        }
        else{
            System.out.println("The move is invalid");
        }
    }
}