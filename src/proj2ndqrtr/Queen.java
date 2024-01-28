/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2ndqrtr;

/**
 *
 * @author ClydeLaptop
 */
public class Queen extends Piece{
    Computer c = new Computer();
    public Queen(String n, int posX, int posY, int v, String c){
    super(n, posX, posY, v, c);
    }
    
    @Override
    
    public void Move (Board board, int newX, int newY){
        int currentX = board.getX(tileNum);
        int currentY = board.getY(tileNum);
        int newTileNum = (newY - 1) * 8 + newX;
        
        if(Math.abs(tileNum-newTileNum)%7==0 || Math.abs(tileNum-newTileNum)%8==0 || Math.abs(tileNum-newTileNum)%9==0 || currentY==newY){
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
       
        if((Math.abs(tileNum-newTileNum)%7==0 || Math.abs(tileNum-newTileNum)%8==0 || Math.abs(tileNum-newTileNum)%9==0 || currentY==newY)&& board.getPieceOnTile(newX, newY)!=null){
            Piece enemyPiece = board.getPieceOnTile(newX, newY);
            thisDice = c.rollDice();
            enemyDice = c.rollDice();
            
            if(enemyPiece.getName().equals("king")){
                if(thisDice > enemyDice){
                    System.out.println(this.getColor() + " won the dice roll");
                    c.endGame(this.getColor());
                }
                else if(thisDice == enemyDice){
                    while(thisCoin.equals(enemyCoin)){
                        thisCoin = c.flipCoin();
                        enemyCoin = c.flipCoin();
                    }
                    if(thisCoin.equals("heads")){
                        System.out.println(this.getColor() + " won the coin flip");
                        c.endGame(this.getColor());
                    }
                    else{
                        System.out.println("The king won the coin flip");
                        board.removePieceFromTile(currentX, currentY);
                    }
                }
                else{
                    System.out.println("the king won the dice roll");
                    board.removePieceFromTile(currentX, currentY);
                }
            }
            else{
                if(thisDice>enemyDice){
                    board.removePieceFromTile(newX, newY);
                    if(this.getValue()>=enemyPiece.getValue())
                        board.placePieceOnTile(currentX, currentY, this);
                    else{
                        board.removePieceFromTile(currentX, currentY);
                        board.placePieceOnTile(currentX, currentY, enemyPiece);
                        enemyPiece.changeColor();
                    }
                }
                else if (thisDice<enemyDice){
                    board.removePieceFromTile(currentX, currentY);
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
                        if(this.getValue()>=enemyPiece.getValue())
                            board.placePieceOnTile(currentX, currentY, this);
                        else{
                            board.removePieceFromTile(currentX, currentY);
                            board.placePieceOnTile(currentX, currentY, enemyPiece);
                            enemyPiece.changeColor();
                        }
                    }
                    else
                        board.removePieceFromTile(currentX, currentY);
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
